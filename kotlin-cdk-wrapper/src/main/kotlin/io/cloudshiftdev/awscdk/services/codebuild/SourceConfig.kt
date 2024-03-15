@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface SourceConfig {
  public fun buildTriggers(): CfnProject.ProjectTriggersProperty? =
      unwrap(this).getBuildTriggers()?.let(CfnProject.ProjectTriggersProperty::wrap)

  public fun sourceProperty(): CfnProject.SourceProperty

  public fun sourceVersion(): String? = unwrap(this).getSourceVersion()

  @CdkDslMarker
  public interface Builder {
    public fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b31c6f8103008d0a0fd22ef541ca8b7a1510d8e9223b9981e7ec113f82127ddc")
    public fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty.Builder.() -> Unit)

    public fun sourceProperty(sourceProperty: CfnProject.SourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cfceff0ac51b0021f8ad41227a9cafc14b8aa237334fd1191424d2aa70f6d22")
    public fun sourceProperty(sourceProperty: CfnProject.SourceProperty.Builder.() -> Unit)

    public fun sourceVersion(sourceVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.SourceConfig.Builder =
        software.amazon.awscdk.services.codebuild.SourceConfig.builder()

    override fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty) {
      cdkBuilder.buildTriggers(buildTriggers.let(CfnProject.ProjectTriggersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b31c6f8103008d0a0fd22ef541ca8b7a1510d8e9223b9981e7ec113f82127ddc")
    override
        fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty.Builder.() -> Unit):
        Unit = buildTriggers(CfnProject.ProjectTriggersProperty(buildTriggers))

    override fun sourceProperty(sourceProperty: CfnProject.SourceProperty) {
      cdkBuilder.sourceProperty(sourceProperty.let(CfnProject.SourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cfceff0ac51b0021f8ad41227a9cafc14b8aa237334fd1191424d2aa70f6d22")
    override fun sourceProperty(sourceProperty: CfnProject.SourceProperty.Builder.() -> Unit): Unit
        = sourceProperty(CfnProject.SourceProperty(sourceProperty))

    override fun sourceVersion(sourceVersion: String) {
      cdkBuilder.sourceVersion(sourceVersion)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.SourceConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.SourceConfig,
  ) : CdkObject(cdkObject), SourceConfig {
    override fun buildTriggers(): CfnProject.ProjectTriggersProperty? =
        unwrap(this).getBuildTriggers()?.let(CfnProject.ProjectTriggersProperty::wrap)

    override fun sourceProperty(): CfnProject.SourceProperty =
        unwrap(this).getSourceProperty().let(CfnProject.SourceProperty::wrap)

    override fun sourceVersion(): String? = unwrap(this).getSourceVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.SourceConfig):
        SourceConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceConfig):
        software.amazon.awscdk.services.codebuild.SourceConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codebuild.SourceConfig
  }
}
