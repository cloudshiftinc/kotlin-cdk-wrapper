@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qldb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLedgerProps {
  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  public fun kmsKey(): String? = unwrap(this).getKmsKey()

  public fun name(): String? = unwrap(this).getName()

  public fun permissionsMode(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun deletionProtection(deletionProtection: Boolean)

    public fun deletionProtection(deletionProtection: IResolvable)

    public fun kmsKey(kmsKey: String)

    public fun name(name: String)

    public fun permissionsMode(permissionsMode: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qldb.CfnLedgerProps.Builder =
        software.amazon.awscdk.services.qldb.CfnLedgerProps.builder()

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun permissionsMode(permissionsMode: String) {
      cdkBuilder.permissionsMode(permissionsMode)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.qldb.CfnLedgerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.qldb.CfnLedgerProps,
  ) : CdkObject(cdkObject), CfnLedgerProps {
    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    override fun kmsKey(): String? = unwrap(this).getKmsKey()

    override fun name(): String? = unwrap(this).getName()

    override fun permissionsMode(): String = unwrap(this).getPermissionsMode()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLedgerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qldb.CfnLedgerProps):
        CfnLedgerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLedgerProps):
        software.amazon.awscdk.services.qldb.CfnLedgerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.qldb.CfnLedgerProps
  }
}
