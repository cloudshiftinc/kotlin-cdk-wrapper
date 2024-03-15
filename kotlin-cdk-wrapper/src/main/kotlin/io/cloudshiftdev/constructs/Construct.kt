@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.constructs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String

public open class Construct internal constructor(
  internal override val cdkObject: software.constructs.Construct,
) : CdkObject(cdkObject), IConstruct {
  public constructor(scope: Construct, id: String) :
      this(software.constructs.Construct(Construct.unwrap(scope), id))

  public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

  public companion object {
    public fun isConstruct(x: Any): Boolean = software.constructs.Construct.isConstruct(x)

    internal fun wrap(cdkObject: software.constructs.Construct): Construct = Construct(cdkObject)

    internal fun unwrap(wrapped: Construct): software.constructs.Construct = wrapped.cdkObject
  }
}
