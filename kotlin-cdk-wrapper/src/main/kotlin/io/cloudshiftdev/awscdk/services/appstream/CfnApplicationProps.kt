@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnApplicationProps {
  public fun appBlockArn(): String

  public fun attributesToDelete(): List<String> = unwrap(this).getAttributesToDelete() ?:
      emptyList()

  public fun description(): String? = unwrap(this).getDescription()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun iconS3Location(): Any

  public fun instanceFamilies(): List<String>

  public fun launchParameters(): String? = unwrap(this).getLaunchParameters()

  public fun launchPath(): String

  public fun name(): String

  public fun platforms(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  @CdkDslMarker
  public interface Builder {
    public fun appBlockArn(appBlockArn: String)

    public fun attributesToDelete(attributesToDelete: List<String>)

    public fun attributesToDelete(vararg attributesToDelete: String)

    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun iconS3Location(iconS3Location: IResolvable)

    public fun iconS3Location(iconS3Location: CfnApplication.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef88c4577d0c5db3d856fddd2d3a26413ab9b278034dc303578c7f48e02b0e27")
    public fun iconS3Location(iconS3Location: CfnApplication.S3LocationProperty.Builder.() -> Unit)

    public fun instanceFamilies(instanceFamilies: List<String>)

    public fun instanceFamilies(vararg instanceFamilies: String)

    public fun launchParameters(launchParameters: String)

    public fun launchPath(launchPath: String)

    public fun name(name: String)

    public fun platforms(platforms: List<String>)

    public fun platforms(vararg platforms: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.appstream.CfnApplicationProps.builder()

    override fun appBlockArn(appBlockArn: String) {
      cdkBuilder.appBlockArn(appBlockArn)
    }

    override fun attributesToDelete(attributesToDelete: List<String>) {
      cdkBuilder.attributesToDelete(attributesToDelete)
    }

    override fun attributesToDelete(vararg attributesToDelete: String): Unit =
        attributesToDelete(attributesToDelete.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun iconS3Location(iconS3Location: IResolvable) {
      cdkBuilder.iconS3Location(iconS3Location.let(IResolvable::unwrap))
    }

    override fun iconS3Location(iconS3Location: CfnApplication.S3LocationProperty) {
      cdkBuilder.iconS3Location(iconS3Location.let(CfnApplication.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef88c4577d0c5db3d856fddd2d3a26413ab9b278034dc303578c7f48e02b0e27")
    override
        fun iconS3Location(iconS3Location: CfnApplication.S3LocationProperty.Builder.() -> Unit):
        Unit = iconS3Location(CfnApplication.S3LocationProperty(iconS3Location))

    override fun instanceFamilies(instanceFamilies: List<String>) {
      cdkBuilder.instanceFamilies(instanceFamilies)
    }

    override fun instanceFamilies(vararg instanceFamilies: String): Unit =
        instanceFamilies(instanceFamilies.toList())

    override fun launchParameters(launchParameters: String) {
      cdkBuilder.launchParameters(launchParameters)
    }

    override fun launchPath(launchPath: String) {
      cdkBuilder.launchPath(launchPath)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun platforms(platforms: List<String>) {
      cdkBuilder.platforms(platforms)
    }

    override fun platforms(vararg platforms: String): Unit = platforms(platforms.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    override fun appBlockArn(): String = unwrap(this).getAppBlockArn()

    override fun attributesToDelete(): List<String> = unwrap(this).getAttributesToDelete() ?:
        emptyList()

    override fun description(): String? = unwrap(this).getDescription()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun iconS3Location(): Any = unwrap(this).getIconS3Location()

    override fun instanceFamilies(): List<String> = unwrap(this).getInstanceFamilies()

    override fun launchParameters(): String? = unwrap(this).getLaunchParameters()

    override fun launchPath(): String = unwrap(this).getLaunchPath()

    override fun name(): String = unwrap(this).getName()

    override fun platforms(): List<String> = unwrap(this).getPlatforms()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.appstream.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appstream.CfnApplicationProps
  }
}
