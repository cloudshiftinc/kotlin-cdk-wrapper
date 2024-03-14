package io.cloudshiftdev.awscdk.services.cloudfront

public enum class LambdaEdgeEventType(
    private val cdkObject: software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType,
) {
    ORIGIN_REQUEST(software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType.ORIGIN_REQUEST),
    ORIGIN_RESPONSE(software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType.ORIGIN_RESPONSE),
    VIEWER_REQUEST(software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType.VIEWER_REQUEST),
    VIEWER_RESPONSE(software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType.VIEWER_RESPONSE),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType
        ): LambdaEdgeEventType =
            when (cdkObject) {
                software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType.ORIGIN_REQUEST ->
                    LambdaEdgeEventType.ORIGIN_REQUEST
                software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType.ORIGIN_RESPONSE ->
                    LambdaEdgeEventType.ORIGIN_RESPONSE
                software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType.VIEWER_REQUEST ->
                    LambdaEdgeEventType.VIEWER_REQUEST
                software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType.VIEWER_RESPONSE ->
                    LambdaEdgeEventType.VIEWER_RESPONSE
            }

        internal fun unwrap(
            wrapped: LambdaEdgeEventType
        ): software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType = wrapped.cdkObject
    }
}
