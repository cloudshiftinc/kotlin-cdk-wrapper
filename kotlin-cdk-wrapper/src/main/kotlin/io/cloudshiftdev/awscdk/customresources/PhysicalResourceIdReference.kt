@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.IResolveContext
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List

public open class PhysicalResourceIdReference internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.customresources.PhysicalResourceIdReference,
) : CdkObject(cdkObject), IResolvable {
  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  public override fun resolve(_context: IResolveContext): Any =
      unwrap(this).resolve(_context.let(IResolveContext::unwrap))

  public open fun toJson(): String = unwrap(this).toJSON()

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.customresources.PhysicalResourceIdReference):
        PhysicalResourceIdReference = PhysicalResourceIdReference(cdkObject)

    internal fun unwrap(wrapped: PhysicalResourceIdReference):
        software.amazon.awscdk.customresources.PhysicalResourceIdReference = wrapped.cdkObject
  }
}
