package io.cloudshiftdev.awscdk.services.cloudfront

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

public open class CfnKeyValueStore internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyValueStore,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun comment(): String? = unwrap(this).getComment()

  public open fun comment(`value`: String) {
    unwrap(this).setComment(`value`)
  }

  public open fun importSource(): Any? = unwrap(this).getImportSource()

  public open fun importSource(`value`: IResolvable) {
    unwrap(this).setImportSource(`value`.let(IResolvable::unwrap))
  }

  public open fun importSource(`value`: ImportSourceProperty) {
    unwrap(this).setImportSource(`value`.let(ImportSourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("be46ab132bf05fa3959b21248478064d4e12271c98f26ed3a3acd4f91fda6528")
  public open fun importSource(`value`: ImportSourceProperty.Builder.() -> Unit): Unit =
      importSource(ImportSourceProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun comment(comment: String) {
    }

    public fun importSource(importSource: IResolvable) {
    }

    public fun importSource(importSource: ImportSourceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e23f3a7caff7bb94ad582cd5f164ed195bd067efa764be9a366e6adcf12ca5b4")
    public fun importSource(importSource: ImportSourceProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.Builder =
        software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.Builder.create(scope, id)

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun importSource(importSource: IResolvable) {
      cdkBuilder.importSource(importSource.let(IResolvable::unwrap))
    }

    public override fun importSource(importSource: ImportSourceProperty) {
      cdkBuilder.importSource(importSource.let(ImportSourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e23f3a7caff7bb94ad582cd5f164ed195bd067efa764be9a366e6adcf12ca5b4")
    public override fun importSource(importSource: ImportSourceProperty.Builder.() -> Unit): Unit =
        importSource(ImportSourceProperty(importSource))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnKeyValueStore =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKeyValueStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKeyValueStore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyValueStore):
        CfnKeyValueStore = CfnKeyValueStore(cdkObject)

    internal fun unwrap(wrapped: CfnKeyValueStore):
        software.amazon.awscdk.services.cloudfront.CfnKeyValueStore = wrapped.cdkObject
  }

  public interface ImportSourceProperty {
    public fun sourceArn(): String

    public fun sourceType(): String

    public interface Builder {
      public fun sourceArn(sourceArn: String) {
      }

      public fun sourceType(sourceType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty.builder()

      public override fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
      }

      public override fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty,
    ) : ImportSourceProperty {
      public override fun sourceArn(): String = unwrap(this).getSourceArn()

      public override fun sourceType(): String = unwrap(this).getSourceType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImportSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty):
          ImportSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImportSourceProperty):
          software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
