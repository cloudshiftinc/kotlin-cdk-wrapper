@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An AWS-Lambda backed custom resource provider, for CDK Construct Library constructs.
 *
 * This is a provider for `CustomResource` constructs, backed by an AWS Lambda
 * Function. It only supports NodeJS runtimes.
 *
 *
 * **Application builders do not need to use this provider type**. This is not
 * a generic custom resource provider class. It is specifically
 * intended to be used only by constructs in the AWS CDK Construct Library, and
 * only exists here because of reverse dependency issues (for example, it cannot
 * use `iam.PolicyStatement` objects, since the `iam` library already depends on
 * the CDK `core` library and we cannot have cyclic dependencies).
 *
 *
 * If you are not writing constructs for the AWS Construct Library, you should
 * use the `Provider` class in the `custom-resources` module instead, which has
 * a better API and supports all Lambda runtimes, not just Node.
 *
 * N.B.: When you are writing Custom Resource Providers, there are a number of
 * lifecycle events you have to pay attention to. These are documented in the
 * README of the `custom-resources` module. Be sure to give the documentation
 * in that module a read, regardless of whether you end up using the Provider
 * class in there or this one.
 *
 * Example:
 *
 * ```
 * CustomResourceProvider provider = CustomResourceProvider.getOrCreateProvider(this,
 * "Custom::MyCustomResourceType", CustomResourceProviderProps.builder()
 * .codeDirectory(String.format("%s/my-handler", __dirname))
 * .runtime(CustomResourceProviderRuntime.NODEJS_18_X)
 * .build());
 * provider.addToRolePolicy(Map.of(
 * "Effect", "Allow",
 * "Action", "s3:GetObject",
 * "Resource", "*"));
 * ```
 */
public open class CustomResourceProvider(
  cdkObject: software.amazon.awscdk.CustomResourceProvider,
) : CustomResourceProviderBase(cdkObject) {
  public companion object {
    public fun orCreate(
      scope: Construct,
      uniqueid: String,
      props: CustomResourceProviderProps,
    ): String =
        software.amazon.awscdk.CustomResourceProvider.getOrCreate(scope.let(Construct.Companion::unwrap),
        uniqueid, props.let(CustomResourceProviderProps.Companion::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dfac87d524e6b53be86d072ef3f093e653ab6e867547f672869cb4906eba94c")
    public fun orCreate(
      scope: Construct,
      uniqueid: String,
      props: CustomResourceProviderProps.Builder.() -> Unit,
    ): String = orCreate(scope, uniqueid, CustomResourceProviderProps(props))

    public fun orCreateProvider(
      scope: Construct,
      uniqueid: String,
      props: CustomResourceProviderProps,
    ): CustomResourceProvider =
        software.amazon.awscdk.CustomResourceProvider.getOrCreateProvider(scope.let(Construct.Companion::unwrap),
        uniqueid,
        props.let(CustomResourceProviderProps.Companion::unwrap)).let(CustomResourceProvider::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33ee0785f227952a74fc604843ccf9107ba12152626d5e79a95041f6a89b3617")
    public fun orCreateProvider(
      scope: Construct,
      uniqueid: String,
      props: CustomResourceProviderProps.Builder.() -> Unit,
    ): CustomResourceProvider = orCreateProvider(scope, uniqueid,
        CustomResourceProviderProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResourceProvider):
        CustomResourceProvider = CustomResourceProvider(cdkObject)

    internal fun unwrap(wrapped: CustomResourceProvider):
        software.amazon.awscdk.CustomResourceProvider = wrapped.cdkObject as
        software.amazon.awscdk.CustomResourceProvider
  }
}
