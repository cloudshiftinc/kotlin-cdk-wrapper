@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.constructs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

public interface IConstruct : IDependable {
  public fun node(): Node

  private class Wrapper(
    override val cdkObject: software.constructs.IConstruct,
  ) : CdkObject(cdkObject), IConstruct {
    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.constructs.IConstruct): IConstruct =
        CdkObjectWrappers.wrap(cdkObject) as? IConstruct ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IConstruct): software.constructs.IConstruct = (wrapped as
        CdkObject).cdkObject as software.constructs.IConstruct
  }
}
