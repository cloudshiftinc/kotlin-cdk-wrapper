@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPullThroughCacheRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * CfnPullThroughCacheRuleProps cfnPullThroughCacheRuleProps =
 * CfnPullThroughCacheRuleProps.builder()
 * .credentialArn("credentialArn")
 * .ecrRepositoryPrefix("ecrRepositoryPrefix")
 * .upstreamRegistry("upstreamRegistry")
 * .upstreamRegistryUrl("upstreamRegistryUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html)
 */
public interface CfnPullThroughCacheRuleProps {
  /**
   * The ARN of the Secrets Manager secret associated with the pull through cache rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-credentialarn)
   */
  public fun credentialArn(): String? = unwrap(this).getCredentialArn()

  /**
   * The Amazon ECR repository prefix associated with the pull through cache rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-ecrrepositoryprefix)
   */
  public fun ecrRepositoryPrefix(): String? = unwrap(this).getEcrRepositoryPrefix()

  /**
   * The name of the upstream source registry associated with the pull through cache rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-upstreamregistry)
   */
  public fun upstreamRegistry(): String? = unwrap(this).getUpstreamRegistry()

  /**
   * The upstream registry URL associated with the pull through cache rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-upstreamregistryurl)
   */
  public fun upstreamRegistryUrl(): String? = unwrap(this).getUpstreamRegistryUrl()

  /**
   * A builder for [CfnPullThroughCacheRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param credentialArn The ARN of the Secrets Manager secret associated with the pull through
     * cache rule.
     */
    public fun credentialArn(credentialArn: String)

    /**
     * @param ecrRepositoryPrefix The Amazon ECR repository prefix associated with the pull through
     * cache rule.
     */
    public fun ecrRepositoryPrefix(ecrRepositoryPrefix: String)

    /**
     * @param upstreamRegistry The name of the upstream source registry associated with the pull
     * through cache rule.
     */
    public fun upstreamRegistry(upstreamRegistry: String)

    /**
     * @param upstreamRegistryUrl The upstream registry URL associated with the pull through cache
     * rule.
     */
    public fun upstreamRegistryUrl(upstreamRegistryUrl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps.Builder
        = software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps.builder()

    /**
     * @param credentialArn The ARN of the Secrets Manager secret associated with the pull through
     * cache rule.
     */
    override fun credentialArn(credentialArn: String) {
      cdkBuilder.credentialArn(credentialArn)
    }

    /**
     * @param ecrRepositoryPrefix The Amazon ECR repository prefix associated with the pull through
     * cache rule.
     */
    override fun ecrRepositoryPrefix(ecrRepositoryPrefix: String) {
      cdkBuilder.ecrRepositoryPrefix(ecrRepositoryPrefix)
    }

    /**
     * @param upstreamRegistry The name of the upstream source registry associated with the pull
     * through cache rule.
     */
    override fun upstreamRegistry(upstreamRegistry: String) {
      cdkBuilder.upstreamRegistry(upstreamRegistry)
    }

    /**
     * @param upstreamRegistryUrl The upstream registry URL associated with the pull through cache
     * rule.
     */
    override fun upstreamRegistryUrl(upstreamRegistryUrl: String) {
      cdkBuilder.upstreamRegistryUrl(upstreamRegistryUrl)
    }

    public fun build(): software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps,
  ) : CdkObject(cdkObject), CfnPullThroughCacheRuleProps {
    /**
     * The ARN of the Secrets Manager secret associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-credentialarn)
     */
    override fun credentialArn(): String? = unwrap(this).getCredentialArn()

    /**
     * The Amazon ECR repository prefix associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-ecrrepositoryprefix)
     */
    override fun ecrRepositoryPrefix(): String? = unwrap(this).getEcrRepositoryPrefix()

    /**
     * The name of the upstream source registry associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-upstreamregistry)
     */
    override fun upstreamRegistry(): String? = unwrap(this).getUpstreamRegistry()

    /**
     * The upstream registry URL associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-upstreamregistryurl)
     */
    override fun upstreamRegistryUrl(): String? = unwrap(this).getUpstreamRegistryUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPullThroughCacheRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps):
        CfnPullThroughCacheRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPullThroughCacheRuleProps):
        software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps
  }
}
