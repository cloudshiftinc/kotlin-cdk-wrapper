package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnKeyGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyGroup,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keyGroupConfig(): Any = unwrap(this).getKeyGroupConfig()

  public open fun keyGroupConfig(`value`: IResolvable) {
    unwrap(this).setKeyGroupConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun keyGroupConfig(`value`: KeyGroupConfigProperty) {
    unwrap(this).setKeyGroupConfig(`value`.let(KeyGroupConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d796b6ad1c66be1ac4b472eb7fc131c5b4aa56ddf92910f70b253b8cfdf63aaa")
  public open fun keyGroupConfig(`value`: KeyGroupConfigProperty.Builder.() -> Unit): Unit =
      keyGroupConfig(KeyGroupConfigProperty(`value`))

  public interface Builder {
    public fun keyGroupConfig(keyGroupConfig: IResolvable)

    public fun keyGroupConfig(keyGroupConfig: KeyGroupConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9a4a4f05b6de8381284aad156431b9b88f598f84600d29913cf7a91f781bf4a")
    public fun keyGroupConfig(keyGroupConfig: KeyGroupConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnKeyGroup.Builder =
        software.amazon.awscdk.services.cloudfront.CfnKeyGroup.Builder.create(scope, id)

    override fun keyGroupConfig(keyGroupConfig: IResolvable) {
      cdkBuilder.keyGroupConfig(keyGroupConfig.let(IResolvable::unwrap))
    }

    override fun keyGroupConfig(keyGroupConfig: KeyGroupConfigProperty) {
      cdkBuilder.keyGroupConfig(keyGroupConfig.let(KeyGroupConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9a4a4f05b6de8381284aad156431b9b88f598f84600d29913cf7a91f781bf4a")
    override fun keyGroupConfig(keyGroupConfig: KeyGroupConfigProperty.Builder.() -> Unit): Unit =
        keyGroupConfig(KeyGroupConfigProperty(keyGroupConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnKeyGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKeyGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKeyGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyGroup):
        CfnKeyGroup = CfnKeyGroup(cdkObject)

    internal fun unwrap(wrapped: CfnKeyGroup):
        software.amazon.awscdk.services.cloudfront.CfnKeyGroup = wrapped.cdkObject
  }

  public interface KeyGroupConfigProperty {
    public fun comment(): String? = unwrap(this).getComment()

    public fun items(): List<String>

    public fun name(): String

    public interface Builder {
      public fun comment(comment: String)

      public fun items(items: List<String>)

      public fun items(vararg items: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty.builder()

      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      override fun items(items: List<String>) {
        cdkBuilder.items(items)
      }

      override fun items(vararg items: String): Unit = items(items.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty,
    ) : KeyGroupConfigProperty {
      override fun comment(): String? = unwrap(this).getComment()

      override fun items(): List<String> = unwrap(this).getItems()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty):
          KeyGroupConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyGroupConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
