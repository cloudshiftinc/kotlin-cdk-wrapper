@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean

public abstract class Resource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Resource,
) : Construct(cdkObject), IResource {
  public override fun applyRemovalPolicy(policy: RemovalPolicy) {
    unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
  }

  public override fun env(): ResourceEnvironment =
      unwrap(this).getEnv().let(ResourceEnvironment::wrap)

  public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.Resource,
  ) : Resource(cdkObject)

  public companion object {
    public fun isOwnedResource(construct: IConstruct): Boolean =
        software.amazon.awscdk.Resource.isOwnedResource(construct.let(IConstruct::unwrap))

    public fun isResource(construct: IConstruct): Boolean =
        software.amazon.awscdk.Resource.isResource(construct.let(IConstruct::unwrap))

    internal fun wrap(cdkObject: software.amazon.awscdk.Resource): Resource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Resource): software.amazon.awscdk.Resource = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.Resource
  }
}
