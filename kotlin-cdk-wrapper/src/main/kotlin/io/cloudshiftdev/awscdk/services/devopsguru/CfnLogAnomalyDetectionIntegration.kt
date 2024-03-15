@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devopsguru

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Information about the integration of DevOps Guru with CloudWatch log groups for log anomaly
 * detection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.devopsguru.*;
 * CfnLogAnomalyDetectionIntegration cfnLogAnomalyDetectionIntegration =
 * CfnLogAnomalyDetectionIntegration.Builder.create(this,
 * "MyCfnLogAnomalyDetectionIntegration").build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-loganomalydetectionintegration.html)
 */
public open class CfnLogAnomalyDetectionIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The account ID associated with the integration of DevOps Guru with CloudWatch log groups for
   * log anomaly detection.
   */
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration].
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration.Builder =
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration.Builder.create(scope,
        id)

    public fun build(): software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogAnomalyDetectionIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogAnomalyDetectionIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration):
        CfnLogAnomalyDetectionIntegration = CfnLogAnomalyDetectionIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnLogAnomalyDetectionIntegration):
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration =
        wrapped.cdkObject
  }
}
