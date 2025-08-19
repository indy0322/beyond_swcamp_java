package com.ohgiraffers.section04.testapp.stream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/* 필기. MyObjectOutput를 사용하는 이유는 ObjectOutputStream을 사용할 시, 중복해서 헤더를 사용할 수 없다.
*   MyObjectOutput를 사용하면 moo = new MyObjectOutput(new BufferedOutputStream(new FileOutputStream(file, true)));
*   와 같이 true를 붙임으로써 이미 작성된 파일안에 추가적으로 내용을 작성할 수 있다. 그래서 중복하여 헤더를 사용하기 위해 헤더를 커스텀한다.
* */

public class MyObjectOutput extends ObjectOutputStream {
    public MyObjectOutput(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {}
}
