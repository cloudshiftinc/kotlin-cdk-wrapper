package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.msk.CfnConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrLatestRevisionCreationTime(): String =
      unwrap(this).getAttrLatestRevisionCreationTime()

  public open fun attrLatestRevisionDescription(): String =
      unwrap(this).getAttrLatestRevisionDescription()

  public open fun attrLatestRevisionRevision(): Number =
      unwrap(this).getAttrLatestRevisionRevision()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kafkaVersionsList(): List<String> = unwrap(this).getKafkaVersionsList() ?:
      emptyList()

  public open fun kafkaVersionsList(`value`: List<String>) {
    unwrap(this).setKafkaVersionsList(`value`)
  }

  public open fun latestRevision(): Any? = unwrap(this).getLatestRevision()

  public open fun latestRevision(`value`: IResolvable) {
    unwrap(this).setLatestRevision(`value`.let(IResolvable::unwrap))
  }

  public open fun latestRevision(`value`: LatestRevisionProperty) {
    unwrap(this).setLatestRevision(`value`.let(LatestRevisionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff7fd235140ed3b9b780d2100e75ea7200fbe4458150e1be2c200f3f55992d89")
  public open fun latestRevision(`value`: LatestRevisionProperty.Builder.() -> Unit): Unit =
      latestRevision(LatestRevisionProperty(`value`))

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun serverProperties(): String = unwrap(this).getServerProperties()

  public open fun serverProperties(`value`: String) {
    unwrap(this).setServerProperties(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun kafkaVersionsList(kafkaVersionsList: List<String>) {
    }

    public fun latestRevision(latestRevision: IResolvable) {
    }

    public fun latestRevision(latestRevision: LatestRevisionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5191f149a214eef0b3503b51de3a98cb0e8b852b1d529b6d7ab7c0d1f3e2e7c9")
    public fun latestRevision(latestRevision: LatestRevisionProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun serverProperties(serverProperties: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnConfiguration.Builder =
        software.amazon.awscdk.services.msk.CfnConfiguration.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun kafkaVersionsList(kafkaVersionsList: List<String>) {
      cdkBuilder.kafkaVersionsList(kafkaVersionsList)
    }

    public override fun latestRevision(latestRevision: IResolvable) {
      cdkBuilder.latestRevision(latestRevision.let(IResolvable::unwrap))
    }

    public override fun latestRevision(latestRevision: LatestRevisionProperty) {
      cdkBuilder.latestRevision(latestRevision.let(LatestRevisionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5191f149a214eef0b3503b51de3a98cb0e8b852b1d529b6d7ab7c0d1f3e2e7c9")
    public override fun latestRevision(latestRevision: LatestRevisionProperty.Builder.() -> Unit):
        Unit = latestRevision(LatestRevisionProperty(latestRevision))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun serverProperties(serverProperties: String) {
      cdkBuilder.serverProperties(serverProperties)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnConfiguration = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnConfiguration):
        CfnConfiguration = CfnConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnConfiguration):
        software.amazon.awscdk.services.msk.CfnConfiguration = wrapped.cdkObject
  }

  public interface LatestRevisionProperty {
    public fun creationTime(): String? = unwrap(this).getCreationTime()

    public fun description(): String? = unwrap(this).getDescription()

    public fun revision(): Number? = unwrap(this).getRevision()

    public interface Builder {
      public fun creationTime(creationTime: String) {
      }

      public fun description(description: String) {
      }

      public fun revision(revision: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty.Builder =
          software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty.builder()

      public override fun creationTime(creationTime: String) {
        cdkBuilder.creationTime(creationTime)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty,
    ) : LatestRevisionProperty {
      public override fun creationTime(): String? = unwrap(this).getCreationTime()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun revision(): Number? = unwrap(this).getRevision()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LatestRevisionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty):
          LatestRevisionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LatestRevisionProperty):
          software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
