package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolverQueryLoggingConfig internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) for the query logging configuration.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The number of VPCs that are associated with the query logging configuration.
   */
  public open fun attrAssociationCount(): Number = unwrap(this).getAttrAssociationCount()

  /**
   * The date and time that the query logging configuration was created, in Unix time format and
   * Coordinated Universal Time (UTC).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * A unique string that identifies the request that created the query logging configuration.
   *
   * The `CreatorRequestId` allows failed requests to be retried without the risk of running the
   * operation twice.
   */
  public open fun attrCreatorRequestId(): String = unwrap(this).getAttrCreatorRequestId()

  /**
   * The ID for the query logging configuration.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The AWS account ID for the account that created the query logging configuration.
   */
  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  /**
   * An indication of whether the query logging configuration is shared with other AWS account s, or
   * was shared with the current account by another AWS account .
   *
   * Sharing is configured through AWS Resource Access Manager ( AWS RAM ).
   */
  public open fun attrShareStatus(): String = unwrap(this).getAttrShareStatus()

  /**
   * The status of the specified query logging configuration. Valid values include the following:.
   *
   * * `CREATING` : Resolver is creating the query logging configuration.
   * * `CREATED` : The query logging configuration was successfully created. Resolver is logging
   * queries that originate in the specified VPC.
   * * `DELETING` : Resolver is deleting this query logging configuration.
   * * `FAILED` : Resolver can't deliver logs to the location that is specified in the query logging
   * configuration. Here are two common causes:
   * * The specified destination (for example, an Amazon S3 bucket) was deleted.
   * * Permissions don't allow sending logs to the destination.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a
   * CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
   */
  public open fun destinationArn(): String? = unwrap(this).getDestinationArn()

  /**
   * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a
   * CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
   */
  public open fun destinationArn(`value`: String) {
    unwrap(this).setDestinationArn(`value`)
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
   * The name of the query logging configuration.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the query logging configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a
     * CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html#cfn-route53resolver-resolverqueryloggingconfig-destinationarn)
     * @param destinationArn The ARN of the resource that you want Resolver to send query logs: an
     * Amazon S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream. 
     */
    public fun destinationArn(destinationArn: String)

    /**
     * The name of the query logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html#cfn-route53resolver-resolverqueryloggingconfig-name)
     * @param name The name of the query logging configuration. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig.Builder.create(scope,
        id)

    /**
     * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a
     * CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html#cfn-route53resolver-resolverqueryloggingconfig-destinationarn)
     * @param destinationArn The ARN of the resource that you want Resolver to send query logs: an
     * Amazon S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream. 
     */
    override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    /**
     * The name of the query logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html#cfn-route53resolver-resolverqueryloggingconfig-name)
     * @param name The name of the query logging configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolverQueryLoggingConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolverQueryLoggingConfig(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig):
        CfnResolverQueryLoggingConfig = CfnResolverQueryLoggingConfig(cdkObject)

    internal fun unwrap(wrapped: CfnResolverQueryLoggingConfig):
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig =
        wrapped.cdkObject
  }
}
