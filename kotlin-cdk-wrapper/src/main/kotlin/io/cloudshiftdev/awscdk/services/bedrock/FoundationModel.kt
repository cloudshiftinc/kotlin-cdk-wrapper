@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public open class FoundationModel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.bedrock.FoundationModel,
) : CdkObject(cdkObject), IModel {
  public override fun modelArn(): String = unwrap(this).getModelArn()

  public open fun modelId(): String = unwrap(this).getModelId()

  public companion object {
    public fun fromFoundationModelId(
      scope: Construct,
      _id: String,
      foundationModelId: FoundationModelIdentifier,
    ): FoundationModel =
        software.amazon.awscdk.services.bedrock.FoundationModel.fromFoundationModelId(scope.let(Construct::unwrap),
        _id, foundationModelId.let(FoundationModelIdentifier::unwrap)).let(FoundationModel::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.FoundationModel):
        FoundationModel = FoundationModel(cdkObject)

    internal fun unwrap(wrapped: FoundationModel):
        software.amazon.awscdk.services.bedrock.FoundationModel = wrapped.cdkObject
  }
}
