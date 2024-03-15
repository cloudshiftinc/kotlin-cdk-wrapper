@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnReplicaKeyProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun keyPolicy(): Any

  public fun pendingWindowInDays(): Number? = unwrap(this).getPendingWindowInDays()

  public fun primaryKeyArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun keyPolicy(keyPolicy: Any)

    public fun pendingWindowInDays(pendingWindowInDays: Number)

    public fun primaryKeyArn(primaryKeyArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.CfnReplicaKeyProps.Builder =
        software.amazon.awscdk.services.kms.CfnReplicaKeyProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun keyPolicy(keyPolicy: Any) {
      cdkBuilder.keyPolicy(keyPolicy)
    }

    override fun pendingWindowInDays(pendingWindowInDays: Number) {
      cdkBuilder.pendingWindowInDays(pendingWindowInDays)
    }

    override fun primaryKeyArn(primaryKeyArn: String) {
      cdkBuilder.primaryKeyArn(primaryKeyArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kms.CfnReplicaKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kms.CfnReplicaKeyProps,
  ) : CdkObject(cdkObject), CfnReplicaKeyProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun keyPolicy(): Any = unwrap(this).getKeyPolicy()

    override fun pendingWindowInDays(): Number? = unwrap(this).getPendingWindowInDays()

    override fun primaryKeyArn(): String = unwrap(this).getPrimaryKeyArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicaKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.CfnReplicaKeyProps):
        CfnReplicaKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicaKeyProps):
        software.amazon.awscdk.services.kms.CfnReplicaKeyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kms.CfnReplicaKeyProps
  }
}
