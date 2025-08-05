@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationsignals

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Enables this AWS account to be able to use CloudWatch Application Signals by creating the
 * `AWSServiceRoleForCloudWatchApplicationSignals` service-linked role.
 *
 * This service-linked role has the following permissions:
 *
 * * `xray:GetServiceGraph`
 * * `logs:StartQuery`
 * * `logs:GetQueryResults`
 * * `cloudwatch:GetMetricData`
 * * `cloudwatch:ListMetrics`
 * * `tag:GetResources`
 * * `autoscaling:DescribeAutoScalingGroups`
 *
 * After completing this step, you still need to instrument your Java and Python applications to
 * send data to Application Signals. For more information, see [Enabling Application
 * Signals](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Application-Signals-Enable.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
 * CfnDiscovery cfnDiscovery = CfnDiscovery.Builder.create(this, "MyCfnDiscovery").build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-discovery.html)
 */
public open class CfnDiscovery(
  cdkObject: software.amazon.awscdk.services.applicationsignals.CfnDiscovery,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.applicationsignals.CfnDiscovery(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDiscoveryProps,
  ) :
      this(software.amazon.awscdk.services.applicationsignals.CfnDiscovery(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDiscoveryProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDiscoveryProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDiscoveryProps(props)
  )

  /**
   * The 12 digit AWS Account ID for the account.
   */
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.applicationsignals.CfnDiscovery].
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.applicationsignals.CfnDiscovery.Builder
        = software.amazon.awscdk.services.applicationsignals.CfnDiscovery.Builder.create(scope, id)

    public fun build(): software.amazon.awscdk.services.applicationsignals.CfnDiscovery =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.applicationsignals.CfnDiscovery.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDiscovery {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDiscovery(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnDiscovery):
        CfnDiscovery = CfnDiscovery(cdkObject)

    internal fun unwrap(wrapped: CfnDiscovery):
        software.amazon.awscdk.services.applicationsignals.CfnDiscovery = wrapped.cdkObject as
        software.amazon.awscdk.services.applicationsignals.CfnDiscovery
  }
}
