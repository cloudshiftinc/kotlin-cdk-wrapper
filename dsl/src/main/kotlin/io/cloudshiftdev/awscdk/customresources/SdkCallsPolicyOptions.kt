package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.customresources.SdkCallsPolicyOptions,
  ) : SdkCallsPolicyOptions {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SdkCallsPolicyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.SdkCallsPolicyOptions):
        SdkCallsPolicyOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SdkCallsPolicyOptions):
        software.amazon.awscdk.customresources.SdkCallsPolicyOptions = (wrapped as
        Wrapper).cdkObject
  }
}
