@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.simspaceweaver

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSimulationProps {
  public fun maximumDuration(): String? = unwrap(this).getMaximumDuration()

  public fun name(): String

  public fun roleArn(): String

  public fun schemaS3Location(): Any? = unwrap(this).getSchemaS3Location()

  public fun snapshotS3Location(): Any? = unwrap(this).getSnapshotS3Location()

  @CdkDslMarker
  public interface Builder {
    public fun maximumDuration(maximumDuration: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun schemaS3Location(schemaS3Location: IResolvable)

    public fun schemaS3Location(schemaS3Location: CfnSimulation.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("329650b038bc911b7f9901b7d863c8ab3909b484f2584d97b98d9b94711c4999")
    public
        fun schemaS3Location(schemaS3Location: CfnSimulation.S3LocationProperty.Builder.() -> Unit)

    public fun snapshotS3Location(snapshotS3Location: IResolvable)

    public fun snapshotS3Location(snapshotS3Location: CfnSimulation.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee7dc33f6a24012fabc13cedda102ef77c2c81e1ce1d75802f2cf9f74c30cf4b")
    public
        fun snapshotS3Location(snapshotS3Location: CfnSimulation.S3LocationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps.Builder =
        software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps.builder()

    override fun maximumDuration(maximumDuration: String) {
      cdkBuilder.maximumDuration(maximumDuration)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun schemaS3Location(schemaS3Location: IResolvable) {
      cdkBuilder.schemaS3Location(schemaS3Location.let(IResolvable::unwrap))
    }

    override fun schemaS3Location(schemaS3Location: CfnSimulation.S3LocationProperty) {
      cdkBuilder.schemaS3Location(schemaS3Location.let(CfnSimulation.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("329650b038bc911b7f9901b7d863c8ab3909b484f2584d97b98d9b94711c4999")
    override
        fun schemaS3Location(schemaS3Location: CfnSimulation.S3LocationProperty.Builder.() -> Unit):
        Unit = schemaS3Location(CfnSimulation.S3LocationProperty(schemaS3Location))

    override fun snapshotS3Location(snapshotS3Location: IResolvable) {
      cdkBuilder.snapshotS3Location(snapshotS3Location.let(IResolvable::unwrap))
    }

    override fun snapshotS3Location(snapshotS3Location: CfnSimulation.S3LocationProperty) {
      cdkBuilder.snapshotS3Location(snapshotS3Location.let(CfnSimulation.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee7dc33f6a24012fabc13cedda102ef77c2c81e1ce1d75802f2cf9f74c30cf4b")
    override
        fun snapshotS3Location(snapshotS3Location: CfnSimulation.S3LocationProperty.Builder.() -> Unit):
        Unit = snapshotS3Location(CfnSimulation.S3LocationProperty(snapshotS3Location))

    public fun build(): software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps,
  ) : CdkObject(cdkObject), CfnSimulationProps {
    override fun maximumDuration(): String? = unwrap(this).getMaximumDuration()

    override fun name(): String = unwrap(this).getName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun schemaS3Location(): Any? = unwrap(this).getSchemaS3Location()

    override fun snapshotS3Location(): Any? = unwrap(this).getSnapshotS3Location()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSimulationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps):
        CfnSimulationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSimulationProps):
        software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps
  }
}
