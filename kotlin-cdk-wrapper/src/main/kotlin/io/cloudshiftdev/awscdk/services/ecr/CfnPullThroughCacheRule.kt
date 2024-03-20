@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ECR::PullThroughCacheRule` resource creates or updates a pull through cache rule.
 *
 * A pull through cache rule provides a way to cache images from an upstream registry in your Amazon
 * ECR private registry.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * CfnPullThroughCacheRule cfnPullThroughCacheRule = CfnPullThroughCacheRule.Builder.create(this,
 * "MyCfnPullThroughCacheRule")
 * .credentialArn("credentialArn")
 * .ecrRepositoryPrefix("ecrRepositoryPrefix")
 * .upstreamRegistry("upstreamRegistry")
 * .upstreamRegistryUrl("upstreamRegistryUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html)
 */
public open class CfnPullThroughCacheRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPullThroughCacheRuleProps,
  ) :
      this(software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnPullThroughCacheRuleProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPullThroughCacheRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPullThroughCacheRuleProps(props)
  )

  /**
   * The ARN of the Secrets Manager secret associated with the pull through cache rule.
   */
  public open fun credentialArn(): String? = unwrap(this).getCredentialArn()

  /**
   * The ARN of the Secrets Manager secret associated with the pull through cache rule.
   */
  public open fun credentialArn(`value`: String) {
    unwrap(this).setCredentialArn(`value`)
  }

  /**
   * The Amazon ECR repository prefix associated with the pull through cache rule.
   */
  public open fun ecrRepositoryPrefix(): String? = unwrap(this).getEcrRepositoryPrefix()

  /**
   * The Amazon ECR repository prefix associated with the pull through cache rule.
   */
  public open fun ecrRepositoryPrefix(`value`: String) {
    unwrap(this).setEcrRepositoryPrefix(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the upstream source registry associated with the pull through cache rule.
   */
  public open fun upstreamRegistry(): String? = unwrap(this).getUpstreamRegistry()

  /**
   * The name of the upstream source registry associated with the pull through cache rule.
   */
  public open fun upstreamRegistry(`value`: String) {
    unwrap(this).setUpstreamRegistry(`value`)
  }

  /**
   * The upstream registry URL associated with the pull through cache rule.
   */
  public open fun upstreamRegistryUrl(): String? = unwrap(this).getUpstreamRegistryUrl()

  /**
   * The upstream registry URL associated with the pull through cache rule.
   */
  public open fun upstreamRegistryUrl(`value`: String) {
    unwrap(this).setUpstreamRegistryUrl(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.CfnPullThroughCacheRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the Secrets Manager secret associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-credentialarn)
     * @param credentialArn The ARN of the Secrets Manager secret associated with the pull through
     * cache rule. 
     */
    public fun credentialArn(credentialArn: String)

    /**
     * The Amazon ECR repository prefix associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-ecrrepositoryprefix)
     * @param ecrRepositoryPrefix The Amazon ECR repository prefix associated with the pull through
     * cache rule. 
     */
    public fun ecrRepositoryPrefix(ecrRepositoryPrefix: String)

    /**
     * The name of the upstream source registry associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-upstreamregistry)
     * @param upstreamRegistry The name of the upstream source registry associated with the pull
     * through cache rule. 
     */
    public fun upstreamRegistry(upstreamRegistry: String)

    /**
     * The upstream registry URL associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-upstreamregistryurl)
     * @param upstreamRegistryUrl The upstream registry URL associated with the pull through cache
     * rule. 
     */
    public fun upstreamRegistryUrl(upstreamRegistryUrl: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule.Builder =
        software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule.Builder.create(scope, id)

    /**
     * The ARN of the Secrets Manager secret associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-credentialarn)
     * @param credentialArn The ARN of the Secrets Manager secret associated with the pull through
     * cache rule. 
     */
    override fun credentialArn(credentialArn: String) {
      cdkBuilder.credentialArn(credentialArn)
    }

    /**
     * The Amazon ECR repository prefix associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-ecrrepositoryprefix)
     * @param ecrRepositoryPrefix The Amazon ECR repository prefix associated with the pull through
     * cache rule. 
     */
    override fun ecrRepositoryPrefix(ecrRepositoryPrefix: String) {
      cdkBuilder.ecrRepositoryPrefix(ecrRepositoryPrefix)
    }

    /**
     * The name of the upstream source registry associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-upstreamregistry)
     * @param upstreamRegistry The name of the upstream source registry associated with the pull
     * through cache rule. 
     */
    override fun upstreamRegistry(upstreamRegistry: String) {
      cdkBuilder.upstreamRegistry(upstreamRegistry)
    }

    /**
     * The upstream registry URL associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-upstreamregistryurl)
     * @param upstreamRegistryUrl The upstream registry URL associated with the pull through cache
     * rule. 
     */
    override fun upstreamRegistryUrl(upstreamRegistryUrl: String) {
      cdkBuilder.upstreamRegistryUrl(upstreamRegistryUrl)
    }

    public fun build(): software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPullThroughCacheRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPullThroughCacheRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule):
        CfnPullThroughCacheRule = CfnPullThroughCacheRule(cdkObject)

    internal fun unwrap(wrapped: CfnPullThroughCacheRule):
        software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule = wrapped.cdkObject
  }
}
