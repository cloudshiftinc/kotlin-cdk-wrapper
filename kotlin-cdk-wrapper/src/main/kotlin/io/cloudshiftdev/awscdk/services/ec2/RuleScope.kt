@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface RuleScope {
  public fun id(): String

  public fun scope(): ISecurityGroup

  @CdkDslMarker
  public interface Builder {
    public fun id(id: String)

    public fun scope(scope: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.RuleScope.Builder =
        software.amazon.awscdk.services.ec2.RuleScope.builder()

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun scope(scope: ISecurityGroup) {
      cdkBuilder.scope(scope.let(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.RuleScope = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.RuleScope,
  ) : CdkObject(cdkObject), RuleScope {
    override fun id(): String = unwrap(this).getId()

    override fun scope(): ISecurityGroup = unwrap(this).getScope().let(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuleScope {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.RuleScope): RuleScope =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleScope): software.amazon.awscdk.services.ec2.RuleScope =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.RuleScope
  }
}
