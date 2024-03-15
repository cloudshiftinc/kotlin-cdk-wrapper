@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStorageLensGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrStorageLensGroupArn(): String = unwrap(this).getAttrStorageLensGroupArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun filter(): Any = unwrap(this).getFilter()

  public open fun filter(`value`: IResolvable) {
    unwrap(this).setFilter(`value`.let(IResolvable::unwrap))
  }

  public open fun filter(`value`: FilterProperty) {
    unwrap(this).setFilter(`value`.let(FilterProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("93aa2ef9341a0c2b54d4fe07b6cbcddfcdfdd84804088936fc0230d58d9e0bbe")
  public open fun filter(`value`: FilterProperty.Builder.() -> Unit): Unit =
      filter(FilterProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun filter(filter: IResolvable)

    public fun filter(filter: FilterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c34696e4ff5fce73c11267bb9ecec49746863e32f72ce78d842b72a32fc8d70")
    public fun filter(filter: FilterProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnStorageLensGroup.Builder =
        software.amazon.awscdk.services.s3.CfnStorageLensGroup.Builder.create(scope, id)

    override fun filter(filter: IResolvable) {
      cdkBuilder.filter(filter.let(IResolvable::unwrap))
    }

    override fun filter(filter: FilterProperty) {
      cdkBuilder.filter(filter.let(FilterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c34696e4ff5fce73c11267bb9ecec49746863e32f72ce78d842b72a32fc8d70")
    override fun filter(filter: FilterProperty.Builder.() -> Unit): Unit =
        filter(FilterProperty(filter))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3.CfnStorageLensGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStorageLensGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStorageLensGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup):
        CfnStorageLensGroup = CfnStorageLensGroup(cdkObject)

    internal fun unwrap(wrapped: CfnStorageLensGroup):
        software.amazon.awscdk.services.s3.CfnStorageLensGroup = wrapped.cdkObject
  }

  public interface AndProperty {
    public fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

    public fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

    public fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

    public fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

    public fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

    @CdkDslMarker
    public interface Builder {
      public fun matchAnyPrefix(matchAnyPrefix: List<String>)

      public fun matchAnyPrefix(vararg matchAnyPrefix: String)

      public fun matchAnySuffix(matchAnySuffix: List<String>)

      public fun matchAnySuffix(vararg matchAnySuffix: String)

      public fun matchAnyTag(matchAnyTag: IResolvable)

      public fun matchAnyTag(matchAnyTag: List<Any>)

      public fun matchAnyTag(vararg matchAnyTag: Any)

      public fun matchObjectAge(matchObjectAge: IResolvable)

      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21a4fa559dd0f84f70eb21b6acabd82bd3fab9b7a2d33266d9d1c2f0808e3bdf")
      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit)

      public fun matchObjectSize(matchObjectSize: IResolvable)

      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("398b5e25549a7d2a421e6d3dce560942f00e9340306175234463ccbfc9696d0e")
      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty.builder()

      override fun matchAnyPrefix(matchAnyPrefix: List<String>) {
        cdkBuilder.matchAnyPrefix(matchAnyPrefix)
      }

      override fun matchAnyPrefix(vararg matchAnyPrefix: String): Unit =
          matchAnyPrefix(matchAnyPrefix.toList())

      override fun matchAnySuffix(matchAnySuffix: List<String>) {
        cdkBuilder.matchAnySuffix(matchAnySuffix)
      }

      override fun matchAnySuffix(vararg matchAnySuffix: String): Unit =
          matchAnySuffix(matchAnySuffix.toList())

      override fun matchAnyTag(matchAnyTag: IResolvable) {
        cdkBuilder.matchAnyTag(matchAnyTag.let(IResolvable::unwrap))
      }

      override fun matchAnyTag(matchAnyTag: List<Any>) {
        cdkBuilder.matchAnyTag(matchAnyTag)
      }

      override fun matchAnyTag(vararg matchAnyTag: Any): Unit = matchAnyTag(matchAnyTag.toList())

      override fun matchObjectAge(matchObjectAge: IResolvable) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(IResolvable::unwrap))
      }

      override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(MatchObjectAgeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21a4fa559dd0f84f70eb21b6acabd82bd3fab9b7a2d33266d9d1c2f0808e3bdf")
      override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit): Unit =
          matchObjectAge(MatchObjectAgeProperty(matchObjectAge))

      override fun matchObjectSize(matchObjectSize: IResolvable) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(IResolvable::unwrap))
      }

      override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(MatchObjectSizeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("398b5e25549a7d2a421e6d3dce560942f00e9340306175234463ccbfc9696d0e")
      override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit):
          Unit = matchObjectSize(MatchObjectSizeProperty(matchObjectSize))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty,
    ) : CdkObject(cdkObject), AndProperty {
      override fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

      override fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

      override fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

      override fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

      override fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AndProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty):
          AndProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AndProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty
    }
  }

  public interface MatchObjectSizeProperty {
    public fun bytesGreaterThan(): Number? = unwrap(this).getBytesGreaterThan()

    public fun bytesLessThan(): Number? = unwrap(this).getBytesLessThan()

    @CdkDslMarker
    public interface Builder {
      public fun bytesGreaterThan(bytesGreaterThan: Number)

      public fun bytesLessThan(bytesLessThan: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty.builder()

      override fun bytesGreaterThan(bytesGreaterThan: Number) {
        cdkBuilder.bytesGreaterThan(bytesGreaterThan)
      }

      override fun bytesLessThan(bytesLessThan: Number) {
        cdkBuilder.bytesLessThan(bytesLessThan)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty,
    ) : CdkObject(cdkObject), MatchObjectSizeProperty {
      override fun bytesGreaterThan(): Number? = unwrap(this).getBytesGreaterThan()

      override fun bytesLessThan(): Number? = unwrap(this).getBytesLessThan()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchObjectSizeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty):
          MatchObjectSizeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchObjectSizeProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty
    }
  }

  public interface FilterProperty {
    public fun and(): Any? = unwrap(this).getAnd()

    public fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

    public fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

    public fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

    public fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

    public fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

    public fun or(): Any? = unwrap(this).getOr()

    @CdkDslMarker
    public interface Builder {
      public fun and(and: IResolvable)

      public fun and(and: AndProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8259494a2cacbf55c2d9eecc3c1db3f0c42e4d2fad18f33631bfe3dce54bd1de")
      public fun and(and: AndProperty.Builder.() -> Unit)

      public fun matchAnyPrefix(matchAnyPrefix: List<String>)

      public fun matchAnyPrefix(vararg matchAnyPrefix: String)

      public fun matchAnySuffix(matchAnySuffix: List<String>)

      public fun matchAnySuffix(vararg matchAnySuffix: String)

      public fun matchAnyTag(matchAnyTag: IResolvable)

      public fun matchAnyTag(matchAnyTag: List<Any>)

      public fun matchAnyTag(vararg matchAnyTag: Any)

      public fun matchObjectAge(matchObjectAge: IResolvable)

      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a55b3de097cb341cba35867de233fbd2f4652512602b74359191714147a4418")
      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit)

      public fun matchObjectSize(matchObjectSize: IResolvable)

      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4a34bb12ec372dd70248acf7014788636043e222d8596e1031f7067a18536f8")
      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit)

      public fun or(or: IResolvable)

      public fun or(or: OrProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1ad32cfb06fa186bf0f70c948c9816acdd24e160a9e1e71efe9ed1928a2096c")
      public fun or(or: OrProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty.builder()

      override fun and(and: IResolvable) {
        cdkBuilder.and(and.let(IResolvable::unwrap))
      }

      override fun and(and: AndProperty) {
        cdkBuilder.and(and.let(AndProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8259494a2cacbf55c2d9eecc3c1db3f0c42e4d2fad18f33631bfe3dce54bd1de")
      override fun and(and: AndProperty.Builder.() -> Unit): Unit = and(AndProperty(and))

      override fun matchAnyPrefix(matchAnyPrefix: List<String>) {
        cdkBuilder.matchAnyPrefix(matchAnyPrefix)
      }

      override fun matchAnyPrefix(vararg matchAnyPrefix: String): Unit =
          matchAnyPrefix(matchAnyPrefix.toList())

      override fun matchAnySuffix(matchAnySuffix: List<String>) {
        cdkBuilder.matchAnySuffix(matchAnySuffix)
      }

      override fun matchAnySuffix(vararg matchAnySuffix: String): Unit =
          matchAnySuffix(matchAnySuffix.toList())

      override fun matchAnyTag(matchAnyTag: IResolvable) {
        cdkBuilder.matchAnyTag(matchAnyTag.let(IResolvable::unwrap))
      }

      override fun matchAnyTag(matchAnyTag: List<Any>) {
        cdkBuilder.matchAnyTag(matchAnyTag)
      }

      override fun matchAnyTag(vararg matchAnyTag: Any): Unit = matchAnyTag(matchAnyTag.toList())

      override fun matchObjectAge(matchObjectAge: IResolvable) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(IResolvable::unwrap))
      }

      override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(MatchObjectAgeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a55b3de097cb341cba35867de233fbd2f4652512602b74359191714147a4418")
      override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit): Unit =
          matchObjectAge(MatchObjectAgeProperty(matchObjectAge))

      override fun matchObjectSize(matchObjectSize: IResolvable) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(IResolvable::unwrap))
      }

      override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(MatchObjectSizeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4a34bb12ec372dd70248acf7014788636043e222d8596e1031f7067a18536f8")
      override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit):
          Unit = matchObjectSize(MatchObjectSizeProperty(matchObjectSize))

      override fun or(or: IResolvable) {
        cdkBuilder.or(or.let(IResolvable::unwrap))
      }

      override fun or(or: OrProperty) {
        cdkBuilder.or(or.let(OrProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1ad32cfb06fa186bf0f70c948c9816acdd24e160a9e1e71efe9ed1928a2096c")
      override fun or(or: OrProperty.Builder.() -> Unit): Unit = or(OrProperty(or))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      override fun and(): Any? = unwrap(this).getAnd()

      override fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

      override fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

      override fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

      override fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

      override fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

      override fun or(): Any? = unwrap(this).getOr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty
    }
  }

  public interface OrProperty {
    public fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

    public fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

    public fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

    public fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

    public fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

    @CdkDslMarker
    public interface Builder {
      public fun matchAnyPrefix(matchAnyPrefix: List<String>)

      public fun matchAnyPrefix(vararg matchAnyPrefix: String)

      public fun matchAnySuffix(matchAnySuffix: List<String>)

      public fun matchAnySuffix(vararg matchAnySuffix: String)

      public fun matchAnyTag(matchAnyTag: IResolvable)

      public fun matchAnyTag(matchAnyTag: List<Any>)

      public fun matchAnyTag(vararg matchAnyTag: Any)

      public fun matchObjectAge(matchObjectAge: IResolvable)

      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a611e8c260bba330a653a4a57fb9660ce8017b0b680152393b1f320391b3abc")
      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit)

      public fun matchObjectSize(matchObjectSize: IResolvable)

      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5437a1317fee22aeaf320aef20059fe2cee631083400d66afe90ee31b4b5e895")
      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty.builder()

      override fun matchAnyPrefix(matchAnyPrefix: List<String>) {
        cdkBuilder.matchAnyPrefix(matchAnyPrefix)
      }

      override fun matchAnyPrefix(vararg matchAnyPrefix: String): Unit =
          matchAnyPrefix(matchAnyPrefix.toList())

      override fun matchAnySuffix(matchAnySuffix: List<String>) {
        cdkBuilder.matchAnySuffix(matchAnySuffix)
      }

      override fun matchAnySuffix(vararg matchAnySuffix: String): Unit =
          matchAnySuffix(matchAnySuffix.toList())

      override fun matchAnyTag(matchAnyTag: IResolvable) {
        cdkBuilder.matchAnyTag(matchAnyTag.let(IResolvable::unwrap))
      }

      override fun matchAnyTag(matchAnyTag: List<Any>) {
        cdkBuilder.matchAnyTag(matchAnyTag)
      }

      override fun matchAnyTag(vararg matchAnyTag: Any): Unit = matchAnyTag(matchAnyTag.toList())

      override fun matchObjectAge(matchObjectAge: IResolvable) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(IResolvable::unwrap))
      }

      override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(MatchObjectAgeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a611e8c260bba330a653a4a57fb9660ce8017b0b680152393b1f320391b3abc")
      override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit): Unit =
          matchObjectAge(MatchObjectAgeProperty(matchObjectAge))

      override fun matchObjectSize(matchObjectSize: IResolvable) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(IResolvable::unwrap))
      }

      override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(MatchObjectSizeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5437a1317fee22aeaf320aef20059fe2cee631083400d66afe90ee31b4b5e895")
      override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit):
          Unit = matchObjectSize(MatchObjectSizeProperty(matchObjectSize))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty,
    ) : CdkObject(cdkObject), OrProperty {
      override fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

      override fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

      override fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

      override fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

      override fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OrProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty):
          OrProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty
    }
  }

  public interface MatchObjectAgeProperty {
    public fun daysGreaterThan(): Number? = unwrap(this).getDaysGreaterThan()

    public fun daysLessThan(): Number? = unwrap(this).getDaysLessThan()

    @CdkDslMarker
    public interface Builder {
      public fun daysGreaterThan(daysGreaterThan: Number)

      public fun daysLessThan(daysLessThan: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty.builder()

      override fun daysGreaterThan(daysGreaterThan: Number) {
        cdkBuilder.daysGreaterThan(daysGreaterThan)
      }

      override fun daysLessThan(daysLessThan: Number) {
        cdkBuilder.daysLessThan(daysLessThan)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty,
    ) : CdkObject(cdkObject), MatchObjectAgeProperty {
      override fun daysGreaterThan(): Number? = unwrap(this).getDaysGreaterThan()

      override fun daysLessThan(): Number? = unwrap(this).getDaysLessThan()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchObjectAgeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty):
          MatchObjectAgeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchObjectAgeProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty
    }
  }
}
