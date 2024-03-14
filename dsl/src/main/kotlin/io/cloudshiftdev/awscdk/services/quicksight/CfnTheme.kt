package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTheme internal constructor(
  private val cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  public open fun attrType(): String = unwrap(this).getAttrType()

  public open fun attrVersion(): IResolvable = unwrap(this).getAttrVersion().let(IResolvable::wrap)

  public open fun attrVersionArn(): String = unwrap(this).getAttrVersionArn()

  public open fun attrVersionBaseThemeId(): String = unwrap(this).getAttrVersionBaseThemeId()

  public open fun attrVersionConfiguration(): IResolvable =
      unwrap(this).getAttrVersionConfiguration().let(IResolvable::wrap)

  public open fun attrVersionConfigurationDataColorPalette(): IResolvable =
      unwrap(this).getAttrVersionConfigurationDataColorPalette().let(IResolvable::wrap)

  public open fun attrVersionConfigurationSheet(): IResolvable =
      unwrap(this).getAttrVersionConfigurationSheet().let(IResolvable::wrap)

  public open fun attrVersionConfigurationTypography(): IResolvable =
      unwrap(this).getAttrVersionConfigurationTypography().let(IResolvable::wrap)

  public open fun attrVersionConfigurationUiColorPalette(): IResolvable =
      unwrap(this).getAttrVersionConfigurationUiColorPalette().let(IResolvable::wrap)

  public open fun attrVersionCreatedTime(): String = unwrap(this).getAttrVersionCreatedTime()

  public open fun attrVersionDescription(): String = unwrap(this).getAttrVersionDescription()

  public open fun attrVersionErrors(): IResolvable =
      unwrap(this).getAttrVersionErrors().let(IResolvable::wrap)

  public open fun attrVersionStatus(): String = unwrap(this).getAttrVersionStatus()

  public open fun attrVersionVersionNumber(): IResolvable =
      unwrap(this).getAttrVersionVersionNumber().let(IResolvable::wrap)

  public open fun awsAccountId(): String = unwrap(this).getAwsAccountId()

  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  public open fun baseThemeId(): String = unwrap(this).getBaseThemeId()

  public open fun baseThemeId(`value`: String) {
    unwrap(this).setBaseThemeId(`value`)
  }

  public open fun configuration(): Any = unwrap(this).getConfiguration()

  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun configuration(`value`: ThemeConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(ThemeConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b295d489234fd2a3453e33223b7a1195bf8cd068ffaed1d714eeb0fd237dbdcd")
  public open fun configuration(`value`: ThemeConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(ThemeConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun permissions(): Any? = unwrap(this).getPermissions()

  public open fun permissions(`value`: IResolvable) {
    unwrap(this).setPermissions(`value`.let(IResolvable::unwrap))
  }

  public open fun permissions(__idx_ac66f0: List<Any>) {
    unwrap(this).setPermissions(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun themeId(): String = unwrap(this).getThemeId()

  public open fun themeId(`value`: String) {
    unwrap(this).setThemeId(`value`)
  }

  public open fun versionDescription(): String? = unwrap(this).getVersionDescription()

  public open fun versionDescription(`value`: String) {
    unwrap(this).setVersionDescription(`value`)
  }

  public interface Builder {
    public fun awsAccountId(awsAccountId: String) {
    }

    public fun baseThemeId(baseThemeId: String) {
    }

    public fun configuration(configuration: IResolvable) {
    }

    public fun configuration(configuration: ThemeConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53c0bc5706b85e02b209e15b4d625be3e2390a0c0e11e333d74887b55fa469ba")
    public fun configuration(configuration: ThemeConfigurationProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun permissions(permissions: IResolvable) {
    }

    public fun permissions(permissions: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun themeId(themeId: String) {
    }

    public fun versionDescription(versionDescription: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnTheme.Builder =
        software.amazon.awscdk.services.quicksight.CfnTheme.Builder.create(scope, id)

    public override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    public override fun baseThemeId(baseThemeId: String) {
      cdkBuilder.baseThemeId(baseThemeId)
    }

    public override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    public override fun configuration(configuration: ThemeConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(ThemeConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53c0bc5706b85e02b209e15b4d625be3e2390a0c0e11e333d74887b55fa469ba")
    public override fun configuration(configuration: ThemeConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(ThemeConfigurationProperty(configuration))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    public override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun themeId(themeId: String) {
      cdkBuilder.themeId(themeId)
    }

    public override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTheme {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTheme(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme): CfnTheme =
        CfnTheme(cdkObject)

    internal fun unwrap(wrapped: CfnTheme): software.amazon.awscdk.services.quicksight.CfnTheme =
        wrapped.cdkObject
  }

  public interface ThemeConfigurationProperty {
    public fun dataColorPalette(): Any? = unwrap(this).getDataColorPalette()

    public fun sheet(): Any? = unwrap(this).getSheet()

    public fun typography(): Any? = unwrap(this).getTypography()

    public fun uiColorPalette(): Any? = unwrap(this).getUiColorPalette()

    public interface Builder {
      public fun dataColorPalette(dataColorPalette: IResolvable) {
      }

      public fun dataColorPalette(dataColorPalette: DataColorPaletteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a03c2e6b283ebceb911757e6e3791760b572f7a26486a08eab311844b39884ff")
      public fun dataColorPalette(dataColorPalette: DataColorPaletteProperty.Builder.() -> Unit) {
      }

      public fun sheet(sheet: IResolvable) {
      }

      public fun sheet(sheet: SheetStyleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e24b9dbc0782235525b77a7c2c5435e8d0caf9e67687dbf50babeab803ea9422")
      public fun sheet(sheet: SheetStyleProperty.Builder.() -> Unit) {
      }

      public fun typography(typography: IResolvable) {
      }

      public fun typography(typography: TypographyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d3fa9b0d5a5a433eb0dd0028cb9f5669c133201c3eb4ef5fcd2d22d9446447d")
      public fun typography(typography: TypographyProperty.Builder.() -> Unit) {
      }

      public fun uiColorPalette(uiColorPalette: IResolvable) {
      }

      public fun uiColorPalette(uiColorPalette: UIColorPaletteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("68d5d9bafc6026bd91fb21857236d4b5790fcb02ce11a16be45b02cb65e9c18a")
      public fun uiColorPalette(uiColorPalette: UIColorPaletteProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty.builder()

      public override fun dataColorPalette(dataColorPalette: IResolvable) {
        cdkBuilder.dataColorPalette(dataColorPalette.let(IResolvable::unwrap))
      }

      public override fun dataColorPalette(dataColorPalette: DataColorPaletteProperty) {
        cdkBuilder.dataColorPalette(dataColorPalette.let(DataColorPaletteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a03c2e6b283ebceb911757e6e3791760b572f7a26486a08eab311844b39884ff")
      public override
          fun dataColorPalette(dataColorPalette: DataColorPaletteProperty.Builder.() -> Unit): Unit
          = dataColorPalette(DataColorPaletteProperty(dataColorPalette))

      public override fun sheet(sheet: IResolvable) {
        cdkBuilder.sheet(sheet.let(IResolvable::unwrap))
      }

      public override fun sheet(sheet: SheetStyleProperty) {
        cdkBuilder.sheet(sheet.let(SheetStyleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e24b9dbc0782235525b77a7c2c5435e8d0caf9e67687dbf50babeab803ea9422")
      public override fun sheet(sheet: SheetStyleProperty.Builder.() -> Unit): Unit =
          sheet(SheetStyleProperty(sheet))

      public override fun typography(typography: IResolvable) {
        cdkBuilder.typography(typography.let(IResolvable::unwrap))
      }

      public override fun typography(typography: TypographyProperty) {
        cdkBuilder.typography(typography.let(TypographyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d3fa9b0d5a5a433eb0dd0028cb9f5669c133201c3eb4ef5fcd2d22d9446447d")
      public override fun typography(typography: TypographyProperty.Builder.() -> Unit): Unit =
          typography(TypographyProperty(typography))

      public override fun uiColorPalette(uiColorPalette: IResolvable) {
        cdkBuilder.uiColorPalette(uiColorPalette.let(IResolvable::unwrap))
      }

      public override fun uiColorPalette(uiColorPalette: UIColorPaletteProperty) {
        cdkBuilder.uiColorPalette(uiColorPalette.let(UIColorPaletteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("68d5d9bafc6026bd91fb21857236d4b5790fcb02ce11a16be45b02cb65e9c18a")
      public override fun uiColorPalette(uiColorPalette: UIColorPaletteProperty.Builder.() -> Unit):
          Unit = uiColorPalette(UIColorPaletteProperty(uiColorPalette))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty,
    ) : ThemeConfigurationProperty {
      public override fun dataColorPalette(): Any? = unwrap(this).getDataColorPalette()

      public override fun sheet(): Any? = unwrap(this).getSheet()

      public override fun typography(): Any? = unwrap(this).getTypography()

      public override fun uiColorPalette(): Any? = unwrap(this).getUiColorPalette()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ThemeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty):
          ThemeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThemeConfigurationProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TileStyleProperty {
    public fun border(): Any? = unwrap(this).getBorder()

    public interface Builder {
      public fun border(border: IResolvable) {
      }

      public fun border(border: BorderStyleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1722673fbc17d8b0361c6e0058383943839530f777e7832a416e7f1ae1175bb")
      public fun border(border: BorderStyleProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty.builder()

      public override fun border(border: IResolvable) {
        cdkBuilder.border(border.let(IResolvable::unwrap))
      }

      public override fun border(border: BorderStyleProperty) {
        cdkBuilder.border(border.let(BorderStyleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1722673fbc17d8b0361c6e0058383943839530f777e7832a416e7f1ae1175bb")
      public override fun border(border: BorderStyleProperty.Builder.() -> Unit): Unit =
          border(BorderStyleProperty(border))

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty,
    ) : TileStyleProperty {
      public override fun border(): Any? = unwrap(this).getBorder()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TileStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty):
          TileStyleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TileStyleProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TypographyProperty {
    public fun fontFamilies(): Any? = unwrap(this).getFontFamilies()

    public interface Builder {
      public fun fontFamilies(fontFamilies: IResolvable) {
      }

      public fun fontFamilies(fontFamilies: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty.builder()

      public override fun fontFamilies(fontFamilies: IResolvable) {
        cdkBuilder.fontFamilies(fontFamilies.let(IResolvable::unwrap))
      }

      public override fun fontFamilies(fontFamilies: List<Any>) {
        cdkBuilder.fontFamilies(fontFamilies)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty,
    ) : TypographyProperty {
      public override fun fontFamilies(): Any? = unwrap(this).getFontFamilies()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TypographyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty):
          TypographyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TypographyProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TileLayoutStyleProperty {
    public fun gutter(): Any? = unwrap(this).getGutter()

    public fun margin(): Any? = unwrap(this).getMargin()

    public interface Builder {
      public fun gutter(gutter: IResolvable) {
      }

      public fun gutter(gutter: GutterStyleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6592f5ee4f7c7ed756ac83167bb44beca704ac45b89e5413fd57df4199b1ec6")
      public fun gutter(gutter: GutterStyleProperty.Builder.() -> Unit) {
      }

      public fun margin(margin: IResolvable) {
      }

      public fun margin(margin: MarginStyleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdb29804e6c9f2143eb8265f0912a5e52a49924606de54d00308c204e983fd3a")
      public fun margin(margin: MarginStyleProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty.builder()

      public override fun gutter(gutter: IResolvable) {
        cdkBuilder.gutter(gutter.let(IResolvable::unwrap))
      }

      public override fun gutter(gutter: GutterStyleProperty) {
        cdkBuilder.gutter(gutter.let(GutterStyleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6592f5ee4f7c7ed756ac83167bb44beca704ac45b89e5413fd57df4199b1ec6")
      public override fun gutter(gutter: GutterStyleProperty.Builder.() -> Unit): Unit =
          gutter(GutterStyleProperty(gutter))

      public override fun margin(margin: IResolvable) {
        cdkBuilder.margin(margin.let(IResolvable::unwrap))
      }

      public override fun margin(margin: MarginStyleProperty) {
        cdkBuilder.margin(margin.let(MarginStyleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdb29804e6c9f2143eb8265f0912a5e52a49924606de54d00308c204e983fd3a")
      public override fun margin(margin: MarginStyleProperty.Builder.() -> Unit): Unit =
          margin(MarginStyleProperty(margin))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty,
    ) : TileLayoutStyleProperty {
      public override fun gutter(): Any? = unwrap(this).getGutter()

      public override fun margin(): Any? = unwrap(this).getMargin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TileLayoutStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty):
          TileLayoutStyleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TileLayoutStyleProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ThemeVersionProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public fun baseThemeId(): String? = unwrap(this).getBaseThemeId()

    public fun configuration(): Any? = unwrap(this).getConfiguration()

    public fun createdTime(): String? = unwrap(this).getCreatedTime()

    public fun description(): String? = unwrap(this).getDescription()

    public fun errors(): Any? = unwrap(this).getErrors()

    public fun status(): String? = unwrap(this).getStatus()

    public fun versionNumber(): Number? = unwrap(this).getVersionNumber()

    public interface Builder {
      public fun arn(arn: String) {
      }

      public fun baseThemeId(baseThemeId: String) {
      }

      public fun configuration(configuration: IResolvable) {
      }

      public fun configuration(configuration: ThemeConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ee58bf2057c056e3da9d8a081b123d3a55e63e9a0aa8d4f23066d4967006d8c")
      public fun configuration(configuration: ThemeConfigurationProperty.Builder.() -> Unit) {
      }

      public fun createdTime(createdTime: String) {
      }

      public fun description(description: String) {
      }

      public fun errors(errors: IResolvable) {
      }

      public fun errors(errors: List<Any>) {
      }

      public fun status(status: String) {
      }

      public fun versionNumber(versionNumber: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public override fun baseThemeId(baseThemeId: String) {
        cdkBuilder.baseThemeId(baseThemeId)
      }

      public override fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
      }

      public override fun configuration(configuration: ThemeConfigurationProperty) {
        cdkBuilder.configuration(configuration.let(ThemeConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ee58bf2057c056e3da9d8a081b123d3a55e63e9a0aa8d4f23066d4967006d8c")
      public override
          fun configuration(configuration: ThemeConfigurationProperty.Builder.() -> Unit): Unit =
          configuration(ThemeConfigurationProperty(configuration))

      public override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun errors(errors: IResolvable) {
        cdkBuilder.errors(errors.let(IResolvable::unwrap))
      }

      public override fun errors(errors: List<Any>) {
        cdkBuilder.errors(errors)
      }

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public override fun versionNumber(versionNumber: Number) {
        cdkBuilder.versionNumber(versionNumber)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty,
    ) : ThemeVersionProperty {
      public override fun arn(): String? = unwrap(this).getArn()

      public override fun baseThemeId(): String? = unwrap(this).getBaseThemeId()

      public override fun configuration(): Any? = unwrap(this).getConfiguration()

      public override fun createdTime(): String? = unwrap(this).getCreatedTime()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun errors(): Any? = unwrap(this).getErrors()

      public override fun status(): String? = unwrap(this).getStatus()

      public override fun versionNumber(): Number? = unwrap(this).getVersionNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ThemeVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty):
          ThemeVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThemeVersionProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BorderStyleProperty {
    public fun show(): Any? = unwrap(this).getShow()

    public interface Builder {
      public fun show(show: Boolean) {
      }

      public fun show(show: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty.builder()

      public override fun show(show: Boolean) {
        cdkBuilder.show(show)
      }

      public override fun show(show: IResolvable) {
        cdkBuilder.show(show.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty,
    ) : BorderStyleProperty {
      public override fun show(): Any? = unwrap(this).getShow()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BorderStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty):
          BorderStyleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BorderStyleProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MarginStyleProperty {
    public fun show(): Any? = unwrap(this).getShow()

    public interface Builder {
      public fun show(show: Boolean) {
      }

      public fun show(show: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty.builder()

      public override fun show(show: Boolean) {
        cdkBuilder.show(show)
      }

      public override fun show(show: IResolvable) {
        cdkBuilder.show(show.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty,
    ) : MarginStyleProperty {
      public override fun show(): Any? = unwrap(this).getShow()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MarginStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty):
          MarginStyleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MarginStyleProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UIColorPaletteProperty {
    public fun accent(): String? = unwrap(this).getAccent()

    public fun accentForeground(): String? = unwrap(this).getAccentForeground()

    public fun danger(): String? = unwrap(this).getDanger()

    public fun dangerForeground(): String? = unwrap(this).getDangerForeground()

    public fun dimension(): String? = unwrap(this).getDimension()

    public fun dimensionForeground(): String? = unwrap(this).getDimensionForeground()

    public fun measure(): String? = unwrap(this).getMeasure()

    public fun measureForeground(): String? = unwrap(this).getMeasureForeground()

    public fun primaryBackground(): String? = unwrap(this).getPrimaryBackground()

    public fun primaryForeground(): String? = unwrap(this).getPrimaryForeground()

    public fun secondaryBackground(): String? = unwrap(this).getSecondaryBackground()

    public fun secondaryForeground(): String? = unwrap(this).getSecondaryForeground()

    public fun success(): String? = unwrap(this).getSuccess()

    public fun successForeground(): String? = unwrap(this).getSuccessForeground()

    public fun warning(): String? = unwrap(this).getWarning()

    public fun warningForeground(): String? = unwrap(this).getWarningForeground()

    public interface Builder {
      public fun accent(accent: String) {
      }

      public fun accentForeground(accentForeground: String) {
      }

      public fun danger(danger: String) {
      }

      public fun dangerForeground(dangerForeground: String) {
      }

      public fun dimension(dimension: String) {
      }

      public fun dimensionForeground(dimensionForeground: String) {
      }

      public fun measure(measure: String) {
      }

      public fun measureForeground(measureForeground: String) {
      }

      public fun primaryBackground(primaryBackground: String) {
      }

      public fun primaryForeground(primaryForeground: String) {
      }

      public fun secondaryBackground(secondaryBackground: String) {
      }

      public fun secondaryForeground(secondaryForeground: String) {
      }

      public fun success(success: String) {
      }

      public fun successForeground(successForeground: String) {
      }

      public fun warning(warning: String) {
      }

      public fun warningForeground(warningForeground: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty.builder()

      public override fun accent(accent: String) {
        cdkBuilder.accent(accent)
      }

      public override fun accentForeground(accentForeground: String) {
        cdkBuilder.accentForeground(accentForeground)
      }

      public override fun danger(danger: String) {
        cdkBuilder.danger(danger)
      }

      public override fun dangerForeground(dangerForeground: String) {
        cdkBuilder.dangerForeground(dangerForeground)
      }

      public override fun dimension(dimension: String) {
        cdkBuilder.dimension(dimension)
      }

      public override fun dimensionForeground(dimensionForeground: String) {
        cdkBuilder.dimensionForeground(dimensionForeground)
      }

      public override fun measure(measure: String) {
        cdkBuilder.measure(measure)
      }

      public override fun measureForeground(measureForeground: String) {
        cdkBuilder.measureForeground(measureForeground)
      }

      public override fun primaryBackground(primaryBackground: String) {
        cdkBuilder.primaryBackground(primaryBackground)
      }

      public override fun primaryForeground(primaryForeground: String) {
        cdkBuilder.primaryForeground(primaryForeground)
      }

      public override fun secondaryBackground(secondaryBackground: String) {
        cdkBuilder.secondaryBackground(secondaryBackground)
      }

      public override fun secondaryForeground(secondaryForeground: String) {
        cdkBuilder.secondaryForeground(secondaryForeground)
      }

      public override fun success(success: String) {
        cdkBuilder.success(success)
      }

      public override fun successForeground(successForeground: String) {
        cdkBuilder.successForeground(successForeground)
      }

      public override fun warning(warning: String) {
        cdkBuilder.warning(warning)
      }

      public override fun warningForeground(warningForeground: String) {
        cdkBuilder.warningForeground(warningForeground)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty,
    ) : UIColorPaletteProperty {
      public override fun accent(): String? = unwrap(this).getAccent()

      public override fun accentForeground(): String? = unwrap(this).getAccentForeground()

      public override fun danger(): String? = unwrap(this).getDanger()

      public override fun dangerForeground(): String? = unwrap(this).getDangerForeground()

      public override fun dimension(): String? = unwrap(this).getDimension()

      public override fun dimensionForeground(): String? = unwrap(this).getDimensionForeground()

      public override fun measure(): String? = unwrap(this).getMeasure()

      public override fun measureForeground(): String? = unwrap(this).getMeasureForeground()

      public override fun primaryBackground(): String? = unwrap(this).getPrimaryBackground()

      public override fun primaryForeground(): String? = unwrap(this).getPrimaryForeground()

      public override fun secondaryBackground(): String? = unwrap(this).getSecondaryBackground()

      public override fun secondaryForeground(): String? = unwrap(this).getSecondaryForeground()

      public override fun success(): String? = unwrap(this).getSuccess()

      public override fun successForeground(): String? = unwrap(this).getSuccessForeground()

      public override fun warning(): String? = unwrap(this).getWarning()

      public override fun warningForeground(): String? = unwrap(this).getWarningForeground()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UIColorPaletteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty):
          UIColorPaletteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UIColorPaletteProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ThemeErrorProperty {
    public fun message(): String? = unwrap(this).getMessage()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun message(message: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty.builder()

      public override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty,
    ) : ThemeErrorProperty {
      public override fun message(): String? = unwrap(this).getMessage()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ThemeErrorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty):
          ThemeErrorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThemeErrorProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ResourcePermissionProperty {
    public fun actions(): List<String>

    public fun principal(): String

    public fun resource(): String? = unwrap(this).getResource()

    public interface Builder {
      public fun actions(actions: List<String>) {
      }

      public fun principal(principal: String) {
      }

      public fun resource(resource: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty.builder()

      public override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      public override fun principal(principal: String) {
        cdkBuilder.principal(principal)
      }

      public override fun resource(resource: String) {
        cdkBuilder.resource(resource)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty,
    ) : ResourcePermissionProperty {
      public override fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

      public override fun principal(): String = unwrap(this).getPrincipal()

      public override fun resource(): String? = unwrap(this).getResource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourcePermissionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty):
          ResourcePermissionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourcePermissionProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FontProperty {
    public fun fontFamily(): String? = unwrap(this).getFontFamily()

    public interface Builder {
      public fun fontFamily(fontFamily: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty.builder()

      public override fun fontFamily(fontFamily: String) {
        cdkBuilder.fontFamily(fontFamily)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty,
    ) : FontProperty {
      public override fun fontFamily(): String? = unwrap(this).getFontFamily()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FontProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty):
          FontProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FontProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DataColorPaletteProperty {
    public fun colors(): List<String> = unwrap(this).getColors() ?: emptyList()

    public fun emptyFillColor(): String? = unwrap(this).getEmptyFillColor()

    public fun minMaxGradient(): List<String> = unwrap(this).getMinMaxGradient() ?: emptyList()

    public interface Builder {
      public fun colors(colors: List<String>) {
      }

      public fun emptyFillColor(emptyFillColor: String) {
      }

      public fun minMaxGradient(minMaxGradient: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty.builder()

      public override fun colors(colors: List<String>) {
        cdkBuilder.colors(colors)
      }

      public override fun emptyFillColor(emptyFillColor: String) {
        cdkBuilder.emptyFillColor(emptyFillColor)
      }

      public override fun minMaxGradient(minMaxGradient: List<String>) {
        cdkBuilder.minMaxGradient(minMaxGradient)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty,
    ) : DataColorPaletteProperty {
      public override fun colors(): List<String> = unwrap(this).getColors() ?: emptyList()

      public override fun emptyFillColor(): String? = unwrap(this).getEmptyFillColor()

      public override fun minMaxGradient(): List<String> = unwrap(this).getMinMaxGradient() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataColorPaletteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty):
          DataColorPaletteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataColorPaletteProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GutterStyleProperty {
    public fun show(): Any? = unwrap(this).getShow()

    public interface Builder {
      public fun show(show: Boolean) {
      }

      public fun show(show: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty.builder()

      public override fun show(show: Boolean) {
        cdkBuilder.show(show)
      }

      public override fun show(show: IResolvable) {
        cdkBuilder.show(show.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty,
    ) : GutterStyleProperty {
      public override fun show(): Any? = unwrap(this).getShow()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GutterStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty):
          GutterStyleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GutterStyleProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SheetStyleProperty {
    public fun tile(): Any? = unwrap(this).getTile()

    public fun tileLayout(): Any? = unwrap(this).getTileLayout()

    public interface Builder {
      public fun tile(tile: IResolvable) {
      }

      public fun tile(tile: TileStyleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a4d426add8180655d26cfbcd494288c4bc2d1c2ec4a5a21d91f12ac41e65e236")
      public fun tile(tile: TileStyleProperty.Builder.() -> Unit) {
      }

      public fun tileLayout(tileLayout: IResolvable) {
      }

      public fun tileLayout(tileLayout: TileLayoutStyleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24ca86d677971db4f367b6c3b5da1bee1c9f5b15d0292fd98646eac9f0d53604")
      public fun tileLayout(tileLayout: TileLayoutStyleProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty.builder()

      public override fun tile(tile: IResolvable) {
        cdkBuilder.tile(tile.let(IResolvable::unwrap))
      }

      public override fun tile(tile: TileStyleProperty) {
        cdkBuilder.tile(tile.let(TileStyleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a4d426add8180655d26cfbcd494288c4bc2d1c2ec4a5a21d91f12ac41e65e236")
      public override fun tile(tile: TileStyleProperty.Builder.() -> Unit): Unit =
          tile(TileStyleProperty(tile))

      public override fun tileLayout(tileLayout: IResolvable) {
        cdkBuilder.tileLayout(tileLayout.let(IResolvable::unwrap))
      }

      public override fun tileLayout(tileLayout: TileLayoutStyleProperty) {
        cdkBuilder.tileLayout(tileLayout.let(TileLayoutStyleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24ca86d677971db4f367b6c3b5da1bee1c9f5b15d0292fd98646eac9f0d53604")
      public override fun tileLayout(tileLayout: TileLayoutStyleProperty.Builder.() -> Unit): Unit =
          tileLayout(TileLayoutStyleProperty(tileLayout))

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty,
    ) : SheetStyleProperty {
      public override fun tile(): Any? = unwrap(this).getTile()

      public override fun tileLayout(): Any? = unwrap(this).getTileLayout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SheetStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty):
          SheetStyleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SheetStyleProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
