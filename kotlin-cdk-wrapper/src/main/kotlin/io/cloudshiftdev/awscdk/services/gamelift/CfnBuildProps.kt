@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnBuildProps {
  public fun name(): String? = unwrap(this).getName()

  public fun operatingSystem(): String? = unwrap(this).getOperatingSystem()

  public fun serverSdkVersion(): String? = unwrap(this).getServerSdkVersion()

  public fun storageLocation(): Any? = unwrap(this).getStorageLocation()

  public fun version(): String? = unwrap(this).getVersion()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun operatingSystem(operatingSystem: String)

    public fun serverSdkVersion(serverSdkVersion: String)

    public fun storageLocation(storageLocation: IResolvable)

    public fun storageLocation(storageLocation: CfnBuild.StorageLocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16e93302b0d4d7df4342d00e95ceea9a860bfefd728bf485b18ccbc28c2c88be")
    public fun storageLocation(storageLocation: CfnBuild.StorageLocationProperty.Builder.() -> Unit)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnBuildProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnBuildProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun operatingSystem(operatingSystem: String) {
      cdkBuilder.operatingSystem(operatingSystem)
    }

    override fun serverSdkVersion(serverSdkVersion: String) {
      cdkBuilder.serverSdkVersion(serverSdkVersion)
    }

    override fun storageLocation(storageLocation: IResolvable) {
      cdkBuilder.storageLocation(storageLocation.let(IResolvable::unwrap))
    }

    override fun storageLocation(storageLocation: CfnBuild.StorageLocationProperty) {
      cdkBuilder.storageLocation(storageLocation.let(CfnBuild.StorageLocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16e93302b0d4d7df4342d00e95ceea9a860bfefd728bf485b18ccbc28c2c88be")
    override
        fun storageLocation(storageLocation: CfnBuild.StorageLocationProperty.Builder.() -> Unit):
        Unit = storageLocation(CfnBuild.StorageLocationProperty(storageLocation))

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnBuildProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.gamelift.CfnBuildProps,
  ) : CdkObject(cdkObject), CfnBuildProps {
    override fun name(): String? = unwrap(this).getName()

    override fun operatingSystem(): String? = unwrap(this).getOperatingSystem()

    override fun serverSdkVersion(): String? = unwrap(this).getServerSdkVersion()

    override fun storageLocation(): Any? = unwrap(this).getStorageLocation()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBuildProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnBuildProps):
        CfnBuildProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBuildProps):
        software.amazon.awscdk.services.gamelift.CfnBuildProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.gamelift.CfnBuildProps
  }
}
