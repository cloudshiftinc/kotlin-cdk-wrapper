@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface PolicyDocumentProps {
  public fun assignSids(): Boolean? = unwrap(this).getAssignSids()

  public fun minimize(): Boolean? = unwrap(this).getMinimize()

  public fun statements(): List<PolicyStatement> =
      unwrap(this).getStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun assignSids(assignSids: Boolean)

    public fun minimize(minimize: Boolean)

    public fun statements(statements: List<PolicyStatement>)

    public fun statements(vararg statements: PolicyStatement)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.PolicyDocumentProps.Builder =
        software.amazon.awscdk.services.iam.PolicyDocumentProps.builder()

    override fun assignSids(assignSids: Boolean) {
      cdkBuilder.assignSids(assignSids)
    }

    override fun minimize(minimize: Boolean) {
      cdkBuilder.minimize(minimize)
    }

    override fun statements(statements: List<PolicyStatement>) {
      cdkBuilder.statements(statements.map(PolicyStatement::unwrap))
    }

    override fun statements(vararg statements: PolicyStatement): Unit =
        statements(statements.toList())

    public fun build(): software.amazon.awscdk.services.iam.PolicyDocumentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.PolicyDocumentProps,
  ) : CdkObject(cdkObject), PolicyDocumentProps {
    override fun assignSids(): Boolean? = unwrap(this).getAssignSids()

    override fun minimize(): Boolean? = unwrap(this).getMinimize()

    override fun statements(): List<PolicyStatement> =
        unwrap(this).getStatements()?.map(PolicyStatement::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyDocumentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PolicyDocumentProps):
        PolicyDocumentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyDocumentProps):
        software.amazon.awscdk.services.iam.PolicyDocumentProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.PolicyDocumentProps
  }
}
