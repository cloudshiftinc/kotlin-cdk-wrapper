@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnResolverQueryLoggingConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnResolverQueryLoggingConfigProps cfnResolverQueryLoggingConfigProps =
 * CfnResolverQueryLoggingConfigProps.builder()
 * .destinationArn("destinationArn")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html)
 */
public interface CfnResolverQueryLoggingConfigProps {
  /**
   * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a
   * CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html#cfn-route53resolver-resolverqueryloggingconfig-destinationarn)
   */
  public fun destinationArn(): String? = unwrap(this).getDestinationArn()

  /**
   * The name of the query logging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html#cfn-route53resolver-resolverqueryloggingconfig-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [CfnResolverQueryLoggingConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationArn The ARN of the resource that you want Resolver to send query logs: an
     * Amazon S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     */
    public fun destinationArn(destinationArn: String)

    /**
     * @param name The name of the query logging configuration.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps.builder()

    /**
     * @param destinationArn The ARN of the resource that you want Resolver to send query logs: an
     * Amazon S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     */
    override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    /**
     * @param name The name of the query logging configuration.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps,
  ) : CdkObject(cdkObject), CfnResolverQueryLoggingConfigProps {
    /**
     * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a
     * CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html#cfn-route53resolver-resolverqueryloggingconfig-destinationarn)
     */
    override fun destinationArn(): String? = unwrap(this).getDestinationArn()

    /**
     * The name of the query logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html#cfn-route53resolver-resolverqueryloggingconfig-name)
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverQueryLoggingConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps):
        CfnResolverQueryLoggingConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverQueryLoggingConfigProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps
  }
}
