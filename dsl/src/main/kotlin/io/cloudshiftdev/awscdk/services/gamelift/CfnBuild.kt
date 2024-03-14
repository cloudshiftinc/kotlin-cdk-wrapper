package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBuild internal constructor(
  private val cdkObject: software.amazon.awscdk.services.gamelift.CfnBuild,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrBuildId(): String = unwrap(this).getAttrBuildId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun operatingSystem(): String? = unwrap(this).getOperatingSystem()

  public open fun operatingSystem(`value`: String) {
    unwrap(this).setOperatingSystem(`value`)
  }

  public open fun serverSdkVersion(): String? = unwrap(this).getServerSdkVersion()

  public open fun serverSdkVersion(`value`: String) {
    unwrap(this).setServerSdkVersion(`value`)
  }

  public open fun storageLocation(): Any? = unwrap(this).getStorageLocation()

  public open fun storageLocation(`value`: IResolvable) {
    unwrap(this).setStorageLocation(`value`.let(IResolvable::unwrap))
  }

  public open fun storageLocation(`value`: StorageLocationProperty) {
    unwrap(this).setStorageLocation(`value`.let(StorageLocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2cbba7b376908e2d546d1d9aa71a8d7a34c0870fd121f09463c749ed41027af")
  public open fun storageLocation(`value`: StorageLocationProperty.Builder.() -> Unit): Unit =
      storageLocation(StorageLocationProperty(`value`))

  public open fun version(): String? = unwrap(this).getVersion()

  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  public interface Builder {
    public fun name(name: String)

    public fun operatingSystem(operatingSystem: String)

    public fun serverSdkVersion(serverSdkVersion: String)

    public fun storageLocation(storageLocation: IResolvable)

    public fun storageLocation(storageLocation: StorageLocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d5c1888cb6aea4a915f59edee556ca7c9485511849194e4c2886604f2c122cd")
    public fun storageLocation(storageLocation: StorageLocationProperty.Builder.() -> Unit)

    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnBuild.Builder =
        software.amazon.awscdk.services.gamelift.CfnBuild.Builder.create(scope, id)

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

    override fun storageLocation(storageLocation: StorageLocationProperty) {
      cdkBuilder.storageLocation(storageLocation.let(StorageLocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d5c1888cb6aea4a915f59edee556ca7c9485511849194e4c2886604f2c122cd")
    override fun storageLocation(storageLocation: StorageLocationProperty.Builder.() -> Unit): Unit
        = storageLocation(StorageLocationProperty(storageLocation))

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnBuild = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBuild {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBuild(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnBuild): CfnBuild =
        CfnBuild(cdkObject)

    internal fun unwrap(wrapped: CfnBuild): software.amazon.awscdk.services.gamelift.CfnBuild =
        wrapped.cdkObject
  }

  public interface StorageLocationProperty {
    public fun bucket(): String

    public fun key(): String

    public fun objectVersion(): String? = unwrap(this).getObjectVersion()

    public fun roleArn(): String

    public interface Builder {
      public fun bucket(bucket: String)

      public fun key(key: String)

      public fun objectVersion(objectVersion: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty,
    ) : StorageLocationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun key(): String = unwrap(this).getKey()

      override fun objectVersion(): String? = unwrap(this).getObjectVersion()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StorageLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty):
          StorageLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageLocationProperty):
          software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
