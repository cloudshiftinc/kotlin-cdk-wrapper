package io.cloudshiftdev.awscdk.services.lambda.nodejs

public enum class Charset(
    private val cdkObject: software.amazon.awscdk.services.lambda.nodejs.Charset,
) {
    ASCII(software.amazon.awscdk.services.lambda.nodejs.Charset.ASCII),
    UTF8(software.amazon.awscdk.services.lambda.nodejs.Charset.UTF8),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.nodejs.Charset
        ): Charset =
            when (cdkObject) {
                software.amazon.awscdk.services.lambda.nodejs.Charset.ASCII -> Charset.ASCII
                software.amazon.awscdk.services.lambda.nodejs.Charset.UTF8 -> Charset.UTF8
            }

        internal fun unwrap(
            wrapped: Charset
        ): software.amazon.awscdk.services.lambda.nodejs.Charset = wrapped.cdkObject
    }
}
