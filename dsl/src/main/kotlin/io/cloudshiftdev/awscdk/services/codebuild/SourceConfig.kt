package io.cloudshiftdev.awscdk.services.codebuild

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface SourceConfig {
  public fun buildTriggers(): CfnProject.ProjectTriggersProperty? =
      unwrap(this).getBuildTriggers()?.let(CfnProject.ProjectTriggersProperty::wrap)

  public fun sourceProperty(): CfnProject.SourceProperty

  public fun sourceVersion(): String? = unwrap(this).getSourceVersion()

  public interface Builder {
    public fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b31c6f8103008d0a0fd22ef541ca8b7a1510d8e9223b9981e7ec113f82127ddc")
    public fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty.Builder.() -> Unit) {
    }

    public fun sourceProperty(sourceProperty: CfnProject.SourceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cfceff0ac51b0021f8ad41227a9cafc14b8aa237334fd1191424d2aa70f6d22")
    public fun sourceProperty(sourceProperty: CfnProject.SourceProperty.Builder.() -> Unit) {
    }

    public fun sourceVersion(sourceVersion: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.SourceConfig.Builder =
        software.amazon.awscdk.services.codebuild.SourceConfig.builder()

    public override fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty) {
      cdkBuilder.buildTriggers(buildTriggers.let(CfnProject.ProjectTriggersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b31c6f8103008d0a0fd22ef541ca8b7a1510d8e9223b9981e7ec113f82127ddc")
    public override
        fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty.Builder.() -> Unit):
        Unit = buildTriggers(CfnProject.ProjectTriggersProperty(buildTriggers))

    public override fun sourceProperty(sourceProperty: CfnProject.SourceProperty) {
      cdkBuilder.sourceProperty(sourceProperty.let(CfnProject.SourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cfceff0ac51b0021f8ad41227a9cafc14b8aa237334fd1191424d2aa70f6d22")
    public override
        fun sourceProperty(sourceProperty: CfnProject.SourceProperty.Builder.() -> Unit): Unit =
        sourceProperty(CfnProject.SourceProperty(sourceProperty))

    public override fun sourceVersion(sourceVersion: String) {
      cdkBuilder.sourceVersion(sourceVersion)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.SourceConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.SourceConfig,
  ) : SourceConfig {
    public override fun buildTriggers(): CfnProject.ProjectTriggersProperty? =
        unwrap(this).getBuildTriggers()?.let(CfnProject.ProjectTriggersProperty::wrap)

    public override fun sourceProperty(): CfnProject.SourceProperty =
        unwrap(this).getSourceProperty().let(CfnProject.SourceProperty::wrap)

    public override fun sourceVersion(): String? = unwrap(this).getSourceVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.SourceConfig):
        SourceConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceConfig):
        software.amazon.awscdk.services.codebuild.SourceConfig = (wrapped as Wrapper).cdkObject
  }
}
