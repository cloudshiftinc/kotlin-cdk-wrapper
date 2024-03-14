package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolverConfig internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53resolver.CfnResolverConfig,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The status of whether or not the Route 53 Resolver will create autodefined rules for reverse
   * DNS lookups.
   *
   * This is enabled by default.
   */
  public open fun attrAutodefinedReverse(): String = unwrap(this).getAttrAutodefinedReverse()

  /**
   * ID for the Route 53 Resolver configuration.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The owner account ID of the Amazon Virtual Private Cloud VPC.
   */
  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  /**
   * Represents the desired status of `AutodefinedReverse` .
   */
  public open fun autodefinedReverseFlag(): String = unwrap(this).getAutodefinedReverseFlag()

  /**
   * Represents the desired status of `AutodefinedReverse` .
   */
  public open fun autodefinedReverseFlag(`value`: String) {
    unwrap(this).setAutodefinedReverseFlag(`value`)
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
   * The ID of the Amazon Virtual Private Cloud VPC that you're configuring Resolver for.
   */
  public open fun resourceId(): String = unwrap(this).getResourceId()

  /**
   * The ID of the Amazon Virtual Private Cloud VPC that you're configuring Resolver for.
   */
  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53resolver.CfnResolverConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Represents the desired status of `AutodefinedReverse` .
     *
     * The only supported value on creation is `DISABLE` . Deletion of this resource will return
     * `AutodefinedReverse` to its default value of `ENABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html#cfn-route53resolver-resolverconfig-autodefinedreverseflag)
     * @param autodefinedReverseFlag Represents the desired status of `AutodefinedReverse` . 
     */
    public fun autodefinedReverseFlag(autodefinedReverseFlag: String)

    /**
     * The ID of the Amazon Virtual Private Cloud VPC that you're configuring Resolver for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html#cfn-route53resolver-resolverconfig-resourceid)
     * @param resourceId The ID of the Amazon Virtual Private Cloud VPC that you're configuring
     * Resolver for. 
     */
    public fun resourceId(resourceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverConfig.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverConfig.Builder.create(scope, id)

    /**
     * Represents the desired status of `AutodefinedReverse` .
     *
     * The only supported value on creation is `DISABLE` . Deletion of this resource will return
     * `AutodefinedReverse` to its default value of `ENABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html#cfn-route53resolver-resolverconfig-autodefinedreverseflag)
     * @param autodefinedReverseFlag Represents the desired status of `AutodefinedReverse` . 
     */
    override fun autodefinedReverseFlag(autodefinedReverseFlag: String) {
      cdkBuilder.autodefinedReverseFlag(autodefinedReverseFlag)
    }

    /**
     * The ID of the Amazon Virtual Private Cloud VPC that you're configuring Resolver for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html#cfn-route53resolver-resolverconfig-resourceid)
     * @param resourceId The ID of the Amazon Virtual Private Cloud VPC that you're configuring
     * Resolver for. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverConfig =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolverConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolverConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverConfig):
        CfnResolverConfig = CfnResolverConfig(cdkObject)

    internal fun unwrap(wrapped: CfnResolverConfig):
        software.amazon.awscdk.services.route53resolver.CfnResolverConfig = wrapped.cdkObject
  }
}