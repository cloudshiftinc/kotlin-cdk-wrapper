package io.cloudshiftdev.awscdk.services.simspaceweaver

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

public open class CfnSimulation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.simspaceweaver.CfnSimulation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrDescribePayload(): String = unwrap(this).getAttrDescribePayload()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maximumDuration(): String? = unwrap(this).getMaximumDuration()

  public open fun maximumDuration(`value`: String) {
    unwrap(this).setMaximumDuration(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun schemaS3Location(): Any? = unwrap(this).getSchemaS3Location()

  public open fun schemaS3Location(`value`: IResolvable) {
    unwrap(this).setSchemaS3Location(`value`.let(IResolvable::unwrap))
  }

  public open fun schemaS3Location(`value`: S3LocationProperty) {
    unwrap(this).setSchemaS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("475380afe3765bc72323d7d3c3853fb4b4a405f48cd03a77c8e2e3a591691d34")
  public open fun schemaS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      schemaS3Location(S3LocationProperty(`value`))

  public open fun snapshotS3Location(): Any? = unwrap(this).getSnapshotS3Location()

  public open fun snapshotS3Location(`value`: IResolvable) {
    unwrap(this).setSnapshotS3Location(`value`.let(IResolvable::unwrap))
  }

  public open fun snapshotS3Location(`value`: S3LocationProperty) {
    unwrap(this).setSnapshotS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c2801cae644767f75149f0f79e3db62c9cd197d1b485e55d2e04d97753024ab")
  public open fun snapshotS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      snapshotS3Location(S3LocationProperty(`value`))

  public interface Builder {
    public fun maximumDuration(maximumDuration: String) {
    }

    public fun name(name: String) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun schemaS3Location(schemaS3Location: IResolvable) {
    }

    public fun schemaS3Location(schemaS3Location: S3LocationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7db59c9ce544d7dbd83199772c30b881d0db8e078f4412fed47b70f35151b91b")
    public fun schemaS3Location(schemaS3Location: S3LocationProperty.Builder.() -> Unit) {
    }

    public fun snapshotS3Location(snapshotS3Location: IResolvable) {
    }

    public fun snapshotS3Location(snapshotS3Location: S3LocationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e4644105d4bea75c7ef018f662e2ff5c31f9fc7fd491292f07a7540bf866cf5")
    public fun snapshotS3Location(snapshotS3Location: S3LocationProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.simspaceweaver.CfnSimulation.Builder =
        software.amazon.awscdk.services.simspaceweaver.CfnSimulation.Builder.create(scope, id)

    public override fun maximumDuration(maximumDuration: String) {
      cdkBuilder.maximumDuration(maximumDuration)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun schemaS3Location(schemaS3Location: IResolvable) {
      cdkBuilder.schemaS3Location(schemaS3Location.let(IResolvable::unwrap))
    }

    public override fun schemaS3Location(schemaS3Location: S3LocationProperty) {
      cdkBuilder.schemaS3Location(schemaS3Location.let(S3LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7db59c9ce544d7dbd83199772c30b881d0db8e078f4412fed47b70f35151b91b")
    public override fun schemaS3Location(schemaS3Location: S3LocationProperty.Builder.() -> Unit):
        Unit = schemaS3Location(S3LocationProperty(schemaS3Location))

    public override fun snapshotS3Location(snapshotS3Location: IResolvable) {
      cdkBuilder.snapshotS3Location(snapshotS3Location.let(IResolvable::unwrap))
    }

    public override fun snapshotS3Location(snapshotS3Location: S3LocationProperty) {
      cdkBuilder.snapshotS3Location(snapshotS3Location.let(S3LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e4644105d4bea75c7ef018f662e2ff5c31f9fc7fd491292f07a7540bf866cf5")
    public override
        fun snapshotS3Location(snapshotS3Location: S3LocationProperty.Builder.() -> Unit): Unit =
        snapshotS3Location(S3LocationProperty(snapshotS3Location))

    public fun build(): software.amazon.awscdk.services.simspaceweaver.CfnSimulation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSimulation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSimulation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.simspaceweaver.CfnSimulation):
        CfnSimulation = CfnSimulation(cdkObject)

    internal fun unwrap(wrapped: CfnSimulation):
        software.amazon.awscdk.services.simspaceweaver.CfnSimulation = wrapped.cdkObject
  }

  public interface S3LocationProperty {
    public fun bucketName(): String

    public fun objectKey(): String

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun objectKey(objectKey: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.simspaceweaver.CfnSimulation.S3LocationProperty.Builder =
          software.amazon.awscdk.services.simspaceweaver.CfnSimulation.S3LocationProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun objectKey(objectKey: String) {
        cdkBuilder.objectKey(objectKey)
      }

      public fun build():
          software.amazon.awscdk.services.simspaceweaver.CfnSimulation.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.simspaceweaver.CfnSimulation.S3LocationProperty,
    ) : S3LocationProperty {
      public override fun bucketName(): String = unwrap(this).getBucketName()

      public override fun objectKey(): String = unwrap(this).getObjectKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.simspaceweaver.CfnSimulation.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.simspaceweaver.CfnSimulation.S3LocationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
