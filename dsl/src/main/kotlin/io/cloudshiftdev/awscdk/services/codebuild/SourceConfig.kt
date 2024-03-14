package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface SourceConfig {
  /**
   *
   */
  public fun buildTriggers(): CfnProject.ProjectTriggersProperty? =
      unwrap(this).getBuildTriggers()?.let(CfnProject.ProjectTriggersProperty::wrap)

  /**
   *
   */
  public fun sourceProperty(): CfnProject.SourceProperty

  /**
   * `AWS::CodeBuild::Project.SourceVersion`.
   *
   * Default: the latest version
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-sourceversion)
   */
  public fun sourceVersion(): String? = unwrap(this).getSourceVersion()

  /**
   * A builder for [SourceConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param buildTriggers the value to be set.
     */
    public fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty)

    /**
     * @param buildTriggers the value to be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b31c6f8103008d0a0fd22ef541ca8b7a1510d8e9223b9981e7ec113f82127ddc")
    public fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty.Builder.() -> Unit)

    /**
     * @param sourceProperty the value to be set. 
     */
    public fun sourceProperty(sourceProperty: CfnProject.SourceProperty)

    /**
     * @param sourceProperty the value to be set. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cfceff0ac51b0021f8ad41227a9cafc14b8aa237334fd1191424d2aa70f6d22")
    public fun sourceProperty(sourceProperty: CfnProject.SourceProperty.Builder.() -> Unit)

    /**
     * @param sourceVersion `AWS::CodeBuild::Project.SourceVersion`.
     */
    public fun sourceVersion(sourceVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.SourceConfig.Builder =
        software.amazon.awscdk.services.codebuild.SourceConfig.builder()

    /**
     * @param buildTriggers the value to be set.
     */
    override fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty) {
      cdkBuilder.buildTriggers(buildTriggers.let(CfnProject.ProjectTriggersProperty::unwrap))
    }

    /**
     * @param buildTriggers the value to be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b31c6f8103008d0a0fd22ef541ca8b7a1510d8e9223b9981e7ec113f82127ddc")
    override
        fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty.Builder.() -> Unit):
        Unit = buildTriggers(CfnProject.ProjectTriggersProperty(buildTriggers))

    /**
     * @param sourceProperty the value to be set. 
     */
    override fun sourceProperty(sourceProperty: CfnProject.SourceProperty) {
      cdkBuilder.sourceProperty(sourceProperty.let(CfnProject.SourceProperty::unwrap))
    }

    /**
     * @param sourceProperty the value to be set. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cfceff0ac51b0021f8ad41227a9cafc14b8aa237334fd1191424d2aa70f6d22")
    override fun sourceProperty(sourceProperty: CfnProject.SourceProperty.Builder.() -> Unit): Unit
        = sourceProperty(CfnProject.SourceProperty(sourceProperty))

    /**
     * @param sourceVersion `AWS::CodeBuild::Project.SourceVersion`.
     */
    override fun sourceVersion(sourceVersion: String) {
      cdkBuilder.sourceVersion(sourceVersion)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.SourceConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.SourceConfig,
  ) : CdkObject(cdkObject), SourceConfig {
    /**
     *
     */
    override fun buildTriggers(): CfnProject.ProjectTriggersProperty? =
        unwrap(this).getBuildTriggers()?.let(CfnProject.ProjectTriggersProperty::wrap)

    /**
     *
     */
    override fun sourceProperty(): CfnProject.SourceProperty =
        unwrap(this).getSourceProperty().let(CfnProject.SourceProperty::wrap)

    /**
     * `AWS::CodeBuild::Project.SourceVersion`.
     *
     * Default: the latest version
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-sourceversion)
     */
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
