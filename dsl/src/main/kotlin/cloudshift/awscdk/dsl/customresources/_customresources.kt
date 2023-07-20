@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.customresources

import software.amazon.awscdk.customresources.AwsCustomResource
import software.amazon.awscdk.customresources.AwsCustomResourceProps
import software.amazon.awscdk.customresources.AwsSdkCall
import software.amazon.awscdk.customresources.Provider
import software.amazon.awscdk.customresources.ProviderProps
import software.amazon.awscdk.customresources.SdkCallsPolicyOptions
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object customresources {
    public inline fun awsCustomResource(
        scope: Construct,
        id: String,
        block: AwsCustomResourceDsl.() -> Unit = {},
    ): AwsCustomResource {
        val builder = AwsCustomResourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun awsCustomResourceProps(block: AwsCustomResourcePropsDsl.() -> Unit = {}): AwsCustomResourceProps {
        val builder = AwsCustomResourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun awsSdkCall(block: AwsSdkCallDsl.() -> Unit = {}): AwsSdkCall {
        val builder = AwsSdkCallDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun provider(
        scope: Construct,
        id: String,
        block: ProviderDsl.() -> Unit = {},
    ): Provider {
        val builder = ProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun providerProps(block: ProviderPropsDsl.() -> Unit = {}): ProviderProps {
        val builder = ProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sdkCallsPolicyOptions(block: SdkCallsPolicyOptionsDsl.() -> Unit = {}): SdkCallsPolicyOptions {
        val builder = SdkCallsPolicyOptionsDsl()
        builder.apply(block)
        return builder.build()
    }
}
