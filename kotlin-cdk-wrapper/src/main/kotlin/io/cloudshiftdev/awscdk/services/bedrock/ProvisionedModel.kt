@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public open class ProvisionedModel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.bedrock.ProvisionedModel,
) : CdkObject(cdkObject), IModel {
  public override fun modelArn(): String = unwrap(this).getModelArn()

  public companion object {
    public fun fromProvisionedModelArn(
      _scope: Construct,
      _id: String,
      provisionedModelArn: String,
    ): IModel =
        software.amazon.awscdk.services.bedrock.ProvisionedModel.fromProvisionedModelArn(_scope.let(Construct::unwrap),
        _id, provisionedModelArn).let(IModel::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.ProvisionedModel):
        ProvisionedModel = ProvisionedModel(cdkObject)

    internal fun unwrap(wrapped: ProvisionedModel):
        software.amazon.awscdk.services.bedrock.ProvisionedModel = wrapped.cdkObject
  }
}
