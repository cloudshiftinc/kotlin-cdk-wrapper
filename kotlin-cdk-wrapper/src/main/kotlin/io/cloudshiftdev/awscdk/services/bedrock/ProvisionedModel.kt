@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * A Bedrock provisioned model.
 *
 * Note: CloudFormation does not currently support creating Bedrock Provisioned Throughput
 * resources outside of a custom resource. You can import provisioned models created by
 * provisioning throughput in Bedrock outside the CDK or via a custom resource with
 * [ProvisionedModel#fromProvisionedModelArn ].
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * ProvisionedModel.fromProvisionedModelArn(this, "Model",
 * "arn:aws:bedrock:us-east-2:123456789012:provisioned-model/abc-123");
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html)
 */
public open class ProvisionedModel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.bedrock.ProvisionedModel,
) : CdkObject(cdkObject), IModel {
  /**
   * The ARN of the provisioned model.
   */
  public override fun modelArn(): String = unwrap(this).getModelArn()

  public companion object {
    public fun fromProvisionedModelArn(
      scope: Construct,
      id: String,
      provisionedModelArn: String,
    ): IModel =
        software.amazon.awscdk.services.bedrock.ProvisionedModel.fromProvisionedModelArn(scope.let(Construct::unwrap),
        id, provisionedModelArn).let(IModel::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.ProvisionedModel):
        ProvisionedModel = ProvisionedModel(cdkObject)

    internal fun unwrap(wrapped: ProvisionedModel):
        software.amazon.awscdk.services.bedrock.ProvisionedModel = wrapped.cdkObject
  }
}
