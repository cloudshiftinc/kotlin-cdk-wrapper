package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnResolverQueryLoggingConfigAssociationProps {
  /**
   * The ID of the query logging configuration that a VPC is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html#cfn-route53resolver-resolverqueryloggingconfigassociation-resolverquerylogconfigid)
   */
  public fun resolverQueryLogConfigId(): String? = unwrap(this).getResolverQueryLogConfigId()

  /**
   * The ID of the Amazon VPC that is associated with the query logging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html#cfn-route53resolver-resolverqueryloggingconfigassociation-resourceid)
   */
  public fun resourceId(): String? = unwrap(this).getResourceId()

  /**
   * A builder for [CfnResolverQueryLoggingConfigAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resolverQueryLogConfigId The ID of the query logging configuration that a VPC is
     * associated with.
     */
    public fun resolverQueryLogConfigId(resolverQueryLogConfigId: String)

    /**
     * @param resourceId The ID of the Amazon VPC that is associated with the query logging
     * configuration.
     */
    public fun resourceId(resourceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps.Builder
        =
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps.builder()

    /**
     * @param resolverQueryLogConfigId The ID of the query logging configuration that a VPC is
     * associated with.
     */
    override fun resolverQueryLogConfigId(resolverQueryLogConfigId: String) {
      cdkBuilder.resolverQueryLogConfigId(resolverQueryLogConfigId)
    }

    /**
     * @param resourceId The ID of the Amazon VPC that is associated with the query logging
     * configuration.
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps,
  ) : CdkObject(cdkObject), CfnResolverQueryLoggingConfigAssociationProps {
    /**
     * The ID of the query logging configuration that a VPC is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html#cfn-route53resolver-resolverqueryloggingconfigassociation-resolverquerylogconfigid)
     */
    override fun resolverQueryLogConfigId(): String? = unwrap(this).getResolverQueryLogConfigId()

    /**
     * The ID of the Amazon VPC that is associated with the query logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html#cfn-route53resolver-resolverqueryloggingconfigassociation-resourceid)
     */
    override fun resourceId(): String? = unwrap(this).getResourceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnResolverQueryLoggingConfigAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps):
        CfnResolverQueryLoggingConfigAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverQueryLoggingConfigAssociationProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps
  }
}
