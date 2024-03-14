package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface IModel {
  /**
   * The ARN of the model.
   *
   * [Documentation](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonbedrock.html#amazonbedrock-actions-as-permissions)
   */
  public fun modelArn(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.bedrock.IModel,
  ) : CdkObject(cdkObject), IModel {
    /**
     * The ARN of the model.
     *
     * [Documentation](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonbedrock.html#amazonbedrock-actions-as-permissions)
     */
    override fun modelArn(): String = unwrap(this).getModelArn()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.IModel): IModel =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IModel): software.amazon.awscdk.services.bedrock.IModel = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.IModel
  }
}
