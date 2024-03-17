@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for the auto-generation of policies based on the configured SDK calls.
 *
 * Example:
 *
 * ```
 * AwsCustomResource getParameter = AwsCustomResource.Builder.create(this, "GetParameter")
 * .onUpdate(AwsSdkCall.builder() // will also be called for a CREATE event
 * .service("SSM")
 * .action("GetParameter")
 * .parameters(Map.of(
 * "Name", "my-parameter",
 * "WithDecryption", true))
 * .physicalResourceId(PhysicalResourceId.of(Date.now().toString())).build())
 * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
 * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
 * .build()))
 * .build();
 * // Use the value in another construct with
 * getParameter.getResponseField("Parameter.Value");
 * ```
 */
public interface SdkCallsPolicyOptions {
  /**
   * The resources that the calls will have access to.
   *
   * It is best to use specific resource ARN's when possible. However, you can also use
   * `AwsCustomResourcePolicy.ANY_RESOURCE`
   * to allow access to all resources. For example, when `onCreate` is used to create a resource
   * which you don't
   * know the physical name of in advance.
   *
   * Note that will apply to ALL SDK calls.
   */
  public fun resources(): List<String>

  /**
   * A builder for [SdkCallsPolicyOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resources The resources that the calls will have access to. 
     * It is best to use specific resource ARN's when possible. However, you can also use
     * `AwsCustomResourcePolicy.ANY_RESOURCE`
     * to allow access to all resources. For example, when `onCreate` is used to create a resource
     * which you don't
     * know the physical name of in advance.
     *
     * Note that will apply to ALL SDK calls.
     */
    public fun resources(resources: List<String>)

    /**
     * @param resources The resources that the calls will have access to. 
     * It is best to use specific resource ARN's when possible. However, you can also use
     * `AwsCustomResourcePolicy.ANY_RESOURCE`
     * to allow access to all resources. For example, when `onCreate` is used to create a resource
     * which you don't
     * know the physical name of in advance.
     *
     * Note that will apply to ALL SDK calls.
     */
    public fun resources(vararg resources: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.SdkCallsPolicyOptions.Builder =
        software.amazon.awscdk.customresources.SdkCallsPolicyOptions.builder()

    /**
     * @param resources The resources that the calls will have access to. 
     * It is best to use specific resource ARN's when possible. However, you can also use
     * `AwsCustomResourcePolicy.ANY_RESOURCE`
     * to allow access to all resources. For example, when `onCreate` is used to create a resource
     * which you don't
     * know the physical name of in advance.
     *
     * Note that will apply to ALL SDK calls.
     */
    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    /**
     * @param resources The resources that the calls will have access to. 
     * It is best to use specific resource ARN's when possible. However, you can also use
     * `AwsCustomResourcePolicy.ANY_RESOURCE`
     * to allow access to all resources. For example, when `onCreate` is used to create a resource
     * which you don't
     * know the physical name of in advance.
     *
     * Note that will apply to ALL SDK calls.
     */
    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    public fun build(): software.amazon.awscdk.customresources.SdkCallsPolicyOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.customresources.SdkCallsPolicyOptions,
  ) : CdkObject(cdkObject), SdkCallsPolicyOptions {
    /**
     * The resources that the calls will have access to.
     *
     * It is best to use specific resource ARN's when possible. However, you can also use
     * `AwsCustomResourcePolicy.ANY_RESOURCE`
     * to allow access to all resources. For example, when `onCreate` is used to create a resource
     * which you don't
     * know the physical name of in advance.
     *
     * Note that will apply to ALL SDK calls.
     */
    override fun resources(): List<String> = unwrap(this).getResources()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SdkCallsPolicyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.SdkCallsPolicyOptions):
        SdkCallsPolicyOptions = CdkObjectWrappers.wrap(cdkObject) as? SdkCallsPolicyOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SdkCallsPolicyOptions):
        software.amazon.awscdk.customresources.SdkCallsPolicyOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.customresources.SdkCallsPolicyOptions
  }
}
