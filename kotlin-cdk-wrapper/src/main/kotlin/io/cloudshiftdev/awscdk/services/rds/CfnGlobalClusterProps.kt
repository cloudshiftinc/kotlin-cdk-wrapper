@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnGlobalClusterProps {
  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  public fun engine(): String? = unwrap(this).getEngine()

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

  public fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  public fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  @CdkDslMarker
  public interface Builder {
    public fun deletionProtection(deletionProtection: Boolean)

    public fun deletionProtection(deletionProtection: IResolvable)

    public fun engine(engine: String)

    public fun engineVersion(engineVersion: String)

    public fun globalClusterIdentifier(globalClusterIdentifier: String)

    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    public fun storageEncrypted(storageEncrypted: Boolean)

    public fun storageEncrypted(storageEncrypted: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnGlobalClusterProps.Builder =
        software.amazon.awscdk.services.rds.CfnGlobalClusterProps.builder()

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun globalClusterIdentifier(globalClusterIdentifier: String) {
      cdkBuilder.globalClusterIdentifier(globalClusterIdentifier)
    }

    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnGlobalClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnGlobalClusterProps,
  ) : CdkObject(cdkObject), CfnGlobalClusterProps {
    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    override fun engine(): String? = unwrap(this).getEngine()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

    override fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

    override fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGlobalClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnGlobalClusterProps):
        CfnGlobalClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalClusterProps):
        software.amazon.awscdk.services.rds.CfnGlobalClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.CfnGlobalClusterProps
  }
}
