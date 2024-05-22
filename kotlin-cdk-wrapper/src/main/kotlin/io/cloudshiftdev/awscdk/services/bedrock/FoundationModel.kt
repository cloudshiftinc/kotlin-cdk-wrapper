@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * A Bedrock base foundation model.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * FoundationModel.fromFoundationModelId(this, "Model",
 * FoundationModelIdentifier.ANTHROPIC_CLAUDE_V2);
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/models-supported.html)
 */
public open class FoundationModel(
  cdkObject: software.amazon.awscdk.services.bedrock.FoundationModel,
) : CdkObject(cdkObject), IModel {
  /**
   * The foundation model ARN.
   */
  public override fun modelArn(): String = unwrap(this).getModelArn()

  /**
   * The foundation model ID.
   *
   * Example:
   *
   * ```
   * "amazon.titan-text-express-v1";
   * ```
   */
  public open fun modelId(): String = unwrap(this).getModelId()

  public companion object {
    public fun fromFoundationModelId(
      scope: Construct,
      id: String,
      foundationModelId: FoundationModelIdentifier,
    ): FoundationModel =
        software.amazon.awscdk.services.bedrock.FoundationModel.fromFoundationModelId(scope.let(Construct.Companion::unwrap),
        id,
        foundationModelId.let(FoundationModelIdentifier.Companion::unwrap)).let(FoundationModel::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.FoundationModel):
        FoundationModel = FoundationModel(cdkObject)

    internal fun unwrap(wrapped: FoundationModel):
        software.amazon.awscdk.services.bedrock.FoundationModel = wrapped.cdkObject as
        software.amazon.awscdk.services.bedrock.FoundationModel
  }
}
