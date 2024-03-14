package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
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

public open class CfnStorageLensGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup,
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  public interface Builder {
    public fun filter(filter: IResolvable) {
    }

    public fun filter(filter: FilterProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c34696e4ff5fce73c11267bb9ecec49746863e32f72ce78d842b72a32fc8d70")
    public fun filter(filter: FilterProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnStorageLensGroup.Builder =
        software.amazon.awscdk.services.s3.CfnStorageLensGroup.Builder.create(scope, id)

    public override fun filter(filter: IResolvable) {
      cdkBuilder.filter(filter.let(IResolvable::unwrap))
    }

    public override fun filter(filter: FilterProperty) {
      cdkBuilder.filter(filter.let(FilterProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c34696e4ff5fce73c11267bb9ecec49746863e32f72ce78d842b72a32fc8d70")
    public override fun filter(filter: FilterProperty.Builder.() -> Unit): Unit =
        filter(FilterProperty(filter))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun matchAnyPrefix(matchAnyPrefix: List<String>) {
      }

      public fun matchAnySuffix(matchAnySuffix: List<String>) {
      }

      public fun matchAnyTag(matchAnyTag: IResolvable) {
      }

      public fun matchAnyTag(matchAnyTag: List<Any>) {
      }

      public fun matchObjectAge(matchObjectAge: IResolvable) {
      }

      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21a4fa559dd0f84f70eb21b6acabd82bd3fab9b7a2d33266d9d1c2f0808e3bdf")
      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit) {
      }

      public fun matchObjectSize(matchObjectSize: IResolvable) {
      }

      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("398b5e25549a7d2a421e6d3dce560942f00e9340306175234463ccbfc9696d0e")
      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty.builder()

      public override fun matchAnyPrefix(matchAnyPrefix: List<String>) {
        cdkBuilder.matchAnyPrefix(matchAnyPrefix)
      }

      public override fun matchAnySuffix(matchAnySuffix: List<String>) {
        cdkBuilder.matchAnySuffix(matchAnySuffix)
      }

      public override fun matchAnyTag(matchAnyTag: IResolvable) {
        cdkBuilder.matchAnyTag(matchAnyTag.let(IResolvable::unwrap))
      }

      public override fun matchAnyTag(matchAnyTag: List<Any>) {
        cdkBuilder.matchAnyTag(matchAnyTag)
      }

      public override fun matchObjectAge(matchObjectAge: IResolvable) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(IResolvable::unwrap))
      }

      public override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(MatchObjectAgeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21a4fa559dd0f84f70eb21b6acabd82bd3fab9b7a2d33266d9d1c2f0808e3bdf")
      public override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit):
          Unit = matchObjectAge(MatchObjectAgeProperty(matchObjectAge))

      public override fun matchObjectSize(matchObjectSize: IResolvable) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(IResolvable::unwrap))
      }

      public override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(MatchObjectSizeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("398b5e25549a7d2a421e6d3dce560942f00e9340306175234463ccbfc9696d0e")
      public override
          fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit): Unit =
          matchObjectSize(MatchObjectSizeProperty(matchObjectSize))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty,
    ) : AndProperty {
      public override fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?:
          emptyList()

      public override fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?:
          emptyList()

      public override fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

      public override fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

      public override fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AndProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty):
          AndProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AndProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MatchObjectSizeProperty {
    public fun bytesGreaterThan(): Number? = unwrap(this).getBytesGreaterThan()

    public fun bytesLessThan(): Number? = unwrap(this).getBytesLessThan()

    public interface Builder {
      public fun bytesGreaterThan(bytesGreaterThan: Number) {
      }

      public fun bytesLessThan(bytesLessThan: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty.builder()

      public override fun bytesGreaterThan(bytesGreaterThan: Number) {
        cdkBuilder.bytesGreaterThan(bytesGreaterThan)
      }

      public override fun bytesLessThan(bytesLessThan: Number) {
        cdkBuilder.bytesLessThan(bytesLessThan)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty,
    ) : MatchObjectSizeProperty {
      public override fun bytesGreaterThan(): Number? = unwrap(this).getBytesGreaterThan()

      public override fun bytesLessThan(): Number? = unwrap(this).getBytesLessThan()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MatchObjectSizeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty):
          MatchObjectSizeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchObjectSizeProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty = (wrapped
          as Wrapper).cdkObject
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

    public interface Builder {
      public fun and(and: IResolvable) {
      }

      public fun and(and: AndProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8259494a2cacbf55c2d9eecc3c1db3f0c42e4d2fad18f33631bfe3dce54bd1de")
      public fun and(and: AndProperty.Builder.() -> Unit) {
      }

      public fun matchAnyPrefix(matchAnyPrefix: List<String>) {
      }

      public fun matchAnySuffix(matchAnySuffix: List<String>) {
      }

      public fun matchAnyTag(matchAnyTag: IResolvable) {
      }

      public fun matchAnyTag(matchAnyTag: List<Any>) {
      }

      public fun matchObjectAge(matchObjectAge: IResolvable) {
      }

      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a55b3de097cb341cba35867de233fbd2f4652512602b74359191714147a4418")
      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit) {
      }

      public fun matchObjectSize(matchObjectSize: IResolvable) {
      }

      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4a34bb12ec372dd70248acf7014788636043e222d8596e1031f7067a18536f8")
      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit) {
      }

      public fun or(or: IResolvable) {
      }

      public fun or(or: OrProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1ad32cfb06fa186bf0f70c948c9816acdd24e160a9e1e71efe9ed1928a2096c")
      public fun or(or: OrProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty.builder()

      public override fun and(and: IResolvable) {
        cdkBuilder.and(and.let(IResolvable::unwrap))
      }

      public override fun and(and: AndProperty) {
        cdkBuilder.and(and.let(AndProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8259494a2cacbf55c2d9eecc3c1db3f0c42e4d2fad18f33631bfe3dce54bd1de")
      public override fun and(and: AndProperty.Builder.() -> Unit): Unit = and(AndProperty(and))

      public override fun matchAnyPrefix(matchAnyPrefix: List<String>) {
        cdkBuilder.matchAnyPrefix(matchAnyPrefix)
      }

      public override fun matchAnySuffix(matchAnySuffix: List<String>) {
        cdkBuilder.matchAnySuffix(matchAnySuffix)
      }

      public override fun matchAnyTag(matchAnyTag: IResolvable) {
        cdkBuilder.matchAnyTag(matchAnyTag.let(IResolvable::unwrap))
      }

      public override fun matchAnyTag(matchAnyTag: List<Any>) {
        cdkBuilder.matchAnyTag(matchAnyTag)
      }

      public override fun matchObjectAge(matchObjectAge: IResolvable) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(IResolvable::unwrap))
      }

      public override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(MatchObjectAgeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a55b3de097cb341cba35867de233fbd2f4652512602b74359191714147a4418")
      public override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit):
          Unit = matchObjectAge(MatchObjectAgeProperty(matchObjectAge))

      public override fun matchObjectSize(matchObjectSize: IResolvable) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(IResolvable::unwrap))
      }

      public override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(MatchObjectSizeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4a34bb12ec372dd70248acf7014788636043e222d8596e1031f7067a18536f8")
      public override
          fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit): Unit =
          matchObjectSize(MatchObjectSizeProperty(matchObjectSize))

      public override fun or(or: IResolvable) {
        cdkBuilder.or(or.let(IResolvable::unwrap))
      }

      public override fun or(or: OrProperty) {
        cdkBuilder.or(or.let(OrProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1ad32cfb06fa186bf0f70c948c9816acdd24e160a9e1e71efe9ed1928a2096c")
      public override fun or(or: OrProperty.Builder.() -> Unit): Unit = or(OrProperty(or))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty,
    ) : FilterProperty {
      public override fun and(): Any? = unwrap(this).getAnd()

      public override fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?:
          emptyList()

      public override fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?:
          emptyList()

      public override fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

      public override fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

      public override fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

      public override fun or(): Any? = unwrap(this).getOr()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OrProperty {
    public fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

    public fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

    public fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

    public fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

    public fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

    public interface Builder {
      public fun matchAnyPrefix(matchAnyPrefix: List<String>) {
      }

      public fun matchAnySuffix(matchAnySuffix: List<String>) {
      }

      public fun matchAnyTag(matchAnyTag: IResolvable) {
      }

      public fun matchAnyTag(matchAnyTag: List<Any>) {
      }

      public fun matchObjectAge(matchObjectAge: IResolvable) {
      }

      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a611e8c260bba330a653a4a57fb9660ce8017b0b680152393b1f320391b3abc")
      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit) {
      }

      public fun matchObjectSize(matchObjectSize: IResolvable) {
      }

      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5437a1317fee22aeaf320aef20059fe2cee631083400d66afe90ee31b4b5e895")
      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty.builder()

      public override fun matchAnyPrefix(matchAnyPrefix: List<String>) {
        cdkBuilder.matchAnyPrefix(matchAnyPrefix)
      }

      public override fun matchAnySuffix(matchAnySuffix: List<String>) {
        cdkBuilder.matchAnySuffix(matchAnySuffix)
      }

      public override fun matchAnyTag(matchAnyTag: IResolvable) {
        cdkBuilder.matchAnyTag(matchAnyTag.let(IResolvable::unwrap))
      }

      public override fun matchAnyTag(matchAnyTag: List<Any>) {
        cdkBuilder.matchAnyTag(matchAnyTag)
      }

      public override fun matchObjectAge(matchObjectAge: IResolvable) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(IResolvable::unwrap))
      }

      public override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(MatchObjectAgeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a611e8c260bba330a653a4a57fb9660ce8017b0b680152393b1f320391b3abc")
      public override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit):
          Unit = matchObjectAge(MatchObjectAgeProperty(matchObjectAge))

      public override fun matchObjectSize(matchObjectSize: IResolvable) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(IResolvable::unwrap))
      }

      public override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(MatchObjectSizeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5437a1317fee22aeaf320aef20059fe2cee631083400d66afe90ee31b4b5e895")
      public override
          fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit): Unit =
          matchObjectSize(MatchObjectSizeProperty(matchObjectSize))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty,
    ) : OrProperty {
      public override fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?:
          emptyList()

      public override fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?:
          emptyList()

      public override fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

      public override fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

      public override fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OrProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty):
          OrProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MatchObjectAgeProperty {
    public fun daysGreaterThan(): Number? = unwrap(this).getDaysGreaterThan()

    public fun daysLessThan(): Number? = unwrap(this).getDaysLessThan()

    public interface Builder {
      public fun daysGreaterThan(daysGreaterThan: Number) {
      }

      public fun daysLessThan(daysLessThan: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty.builder()

      public override fun daysGreaterThan(daysGreaterThan: Number) {
        cdkBuilder.daysGreaterThan(daysGreaterThan)
      }

      public override fun daysLessThan(daysLessThan: Number) {
        cdkBuilder.daysLessThan(daysLessThan)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty,
    ) : MatchObjectAgeProperty {
      public override fun daysGreaterThan(): Number? = unwrap(this).getDaysGreaterThan()

      public override fun daysLessThan(): Number? = unwrap(this).getDaysLessThan()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MatchObjectAgeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty):
          MatchObjectAgeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchObjectAgeProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
