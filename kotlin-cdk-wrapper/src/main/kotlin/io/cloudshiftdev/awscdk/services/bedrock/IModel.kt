@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IModel {
  public fun modelArn(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.bedrock.IModel,
  ) : CdkObject(cdkObject), IModel {
    override fun modelArn(): String = unwrap(this).getModelArn()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.IModel): IModel =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IModel): software.amazon.awscdk.services.bedrock.IModel = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.IModel
  }
}
