@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnScriptProps {
  public fun name(): String? = unwrap(this).getName()

  public fun storageLocation(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun version(): String? = unwrap(this).getVersion()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun storageLocation(storageLocation: IResolvable)

    public fun storageLocation(storageLocation: CfnScript.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("715c4a858d3fad5f13e3d17193800e45a54d32471d0572a79dee0cffe9affb66")
    public fun storageLocation(storageLocation: CfnScript.S3LocationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnScriptProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnScriptProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun storageLocation(storageLocation: IResolvable) {
      cdkBuilder.storageLocation(storageLocation.let(IResolvable::unwrap))
    }

    override fun storageLocation(storageLocation: CfnScript.S3LocationProperty) {
      cdkBuilder.storageLocation(storageLocation.let(CfnScript.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("715c4a858d3fad5f13e3d17193800e45a54d32471d0572a79dee0cffe9affb66")
    override fun storageLocation(storageLocation: CfnScript.S3LocationProperty.Builder.() -> Unit):
        Unit = storageLocation(CfnScript.S3LocationProperty(storageLocation))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnScriptProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.gamelift.CfnScriptProps,
  ) : CdkObject(cdkObject), CfnScriptProps {
    override fun name(): String? = unwrap(this).getName()

    override fun storageLocation(): Any = unwrap(this).getStorageLocation()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScriptProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnScriptProps):
        CfnScriptProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScriptProps):
        software.amazon.awscdk.services.gamelift.CfnScriptProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.gamelift.CfnScriptProps
  }
}
