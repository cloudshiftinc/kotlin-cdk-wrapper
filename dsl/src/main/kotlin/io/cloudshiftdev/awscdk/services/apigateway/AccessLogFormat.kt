package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class AccessLogFormat internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.AccessLogFormat,
) : CdkObject(cdkObject) {
  public companion object {
    public fun clf(): AccessLogFormat =
        software.amazon.awscdk.services.apigateway.AccessLogFormat.clf().let(AccessLogFormat::wrap)

    public fun custom(format: String): AccessLogFormat =
        software.amazon.awscdk.services.apigateway.AccessLogFormat.custom(format).let(AccessLogFormat::wrap)

    public fun jsonWithStandardFields(): AccessLogFormat =
        software.amazon.awscdk.services.apigateway.AccessLogFormat.jsonWithStandardFields().let(AccessLogFormat::wrap)

    public fun jsonWithStandardFields(fields: JsonWithStandardFieldProps): AccessLogFormat =
        software.amazon.awscdk.services.apigateway.AccessLogFormat.jsonWithStandardFields(fields.let(JsonWithStandardFieldProps::unwrap)).let(AccessLogFormat::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4591f774534462d212e2135b0ca5f8af84d2e9b6494b7e776a0c1a4eb95e9593")
    public fun jsonWithStandardFields(fields: JsonWithStandardFieldProps.Builder.() -> Unit):
        AccessLogFormat = jsonWithStandardFields(JsonWithStandardFieldProps(fields))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AccessLogFormat):
        AccessLogFormat = AccessLogFormat(cdkObject)

    internal fun unwrap(wrapped: AccessLogFormat):
        software.amazon.awscdk.services.apigateway.AccessLogFormat = wrapped.cdkObject
  }
}
