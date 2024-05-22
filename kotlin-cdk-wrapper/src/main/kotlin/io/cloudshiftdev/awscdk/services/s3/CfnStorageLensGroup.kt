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
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::S3::StorageLensGroup` resource creates an S3 Storage Lens group.
 *
 * A Storage Lens group is a custom grouping of objects that include filters for prefixes, suffixes,
 * object tags, object size, or object age. You can create an S3 Storage Lens group that includes a
 * single filter or multiple filter conditions. To specify multiple filter conditions, you use `AND` or
 * `OR` logical operators. For more information about S3 Storage Lens groups, see [Working with S3
 * Storage Lens
 * groups](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups-overview.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * CfnStorageLensGroup cfnStorageLensGroup = CfnStorageLensGroup.Builder.create(this,
 * "MyCfnStorageLensGroup")
 * .filter(FilterProperty.builder()
 * .and(AndProperty.builder()
 * .matchAnyPrefix(List.of("matchAnyPrefix"))
 * .matchAnySuffix(List.of("matchAnySuffix"))
 * .matchAnyTag(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .matchObjectAge(MatchObjectAgeProperty.builder()
 * .daysGreaterThan(123)
 * .daysLessThan(123)
 * .build())
 * .matchObjectSize(MatchObjectSizeProperty.builder()
 * .bytesGreaterThan(123)
 * .bytesLessThan(123)
 * .build())
 * .build())
 * .matchAnyPrefix(List.of("matchAnyPrefix"))
 * .matchAnySuffix(List.of("matchAnySuffix"))
 * .matchAnyTag(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .matchObjectAge(MatchObjectAgeProperty.builder()
 * .daysGreaterThan(123)
 * .daysLessThan(123)
 * .build())
 * .matchObjectSize(MatchObjectSizeProperty.builder()
 * .bytesGreaterThan(123)
 * .bytesLessThan(123)
 * .build())
 * .or(OrProperty.builder()
 * .matchAnyPrefix(List.of("matchAnyPrefix"))
 * .matchAnySuffix(List.of("matchAnySuffix"))
 * .matchAnyTag(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .matchObjectAge(MatchObjectAgeProperty.builder()
 * .daysGreaterThan(123)
 * .daysLessThan(123)
 * .build())
 * .matchObjectSize(MatchObjectSizeProperty.builder()
 * .bytesGreaterThan(123)
 * .bytesLessThan(123)
 * .build())
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html)
 */
public open class CfnStorageLensGroup(
  cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStorageLensGroupProps,
  ) :
      this(software.amazon.awscdk.services.s3.CfnStorageLensGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStorageLensGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStorageLensGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStorageLensGroupProps(props)
  )

  /**
   * The ARN for the Amazon S3 Storage Lens Group.
   */
  public open fun attrStorageLensGroupArn(): String = unwrap(this).getAttrStorageLensGroupArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * This property contains the criteria for the Storage Lens group data that is displayed.
   */
  public open fun filter(): Any = unwrap(this).getFilter()

  /**
   * This property contains the criteria for the Storage Lens group data that is displayed.
   */
  public open fun filter(`value`: IResolvable) {
    unwrap(this).setFilter(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * This property contains the criteria for the Storage Lens group data that is displayed.
   */
  public open fun filter(`value`: FilterProperty) {
    unwrap(this).setFilter(`value`.let(FilterProperty.Companion::unwrap))
  }

  /**
   * This property contains the criteria for the Storage Lens group data that is displayed.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("93aa2ef9341a0c2b54d4fe07b6cbcddfcdfdd84804088936fc0230d58d9e0bbe")
  public open fun filter(`value`: FilterProperty.Builder.() -> Unit): Unit =
      filter(FilterProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * This property contains the Storage Lens group name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * This property contains the Storage Lens group name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * This property contains the AWS resource tags that you're adding to your Storage Lens group.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * This property contains the AWS resource tags that you're adding to your Storage Lens group.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * This property contains the AWS resource tags that you're adding to your Storage Lens group.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.CfnStorageLensGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * This property contains the criteria for the Storage Lens group data that is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
     * @param filter This property contains the criteria for the Storage Lens group data that is
     * displayed. 
     */
    public fun filter(filter: IResolvable)

    /**
     * This property contains the criteria for the Storage Lens group data that is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
     * @param filter This property contains the criteria for the Storage Lens group data that is
     * displayed. 
     */
    public fun filter(filter: FilterProperty)

    /**
     * This property contains the criteria for the Storage Lens group data that is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
     * @param filter This property contains the criteria for the Storage Lens group data that is
     * displayed. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c34696e4ff5fce73c11267bb9ecec49746863e32f72ce78d842b72a32fc8d70")
    public fun filter(filter: FilterProperty.Builder.() -> Unit)

    /**
     * This property contains the Storage Lens group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-name)
     * @param name This property contains the Storage Lens group name. 
     */
    public fun name(name: String)

    /**
     * This property contains the AWS resource tags that you're adding to your Storage Lens group.
     *
     * This parameter is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-tags)
     * @param tags This property contains the AWS resource tags that you're adding to your Storage
     * Lens group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * This property contains the AWS resource tags that you're adding to your Storage Lens group.
     *
     * This parameter is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-tags)
     * @param tags This property contains the AWS resource tags that you're adding to your Storage
     * Lens group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnStorageLensGroup.Builder =
        software.amazon.awscdk.services.s3.CfnStorageLensGroup.Builder.create(scope, id)

    /**
     * This property contains the criteria for the Storage Lens group data that is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
     * @param filter This property contains the criteria for the Storage Lens group data that is
     * displayed. 
     */
    override fun filter(filter: IResolvable) {
      cdkBuilder.filter(filter.let(IResolvable.Companion::unwrap))
    }

    /**
     * This property contains the criteria for the Storage Lens group data that is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
     * @param filter This property contains the criteria for the Storage Lens group data that is
     * displayed. 
     */
    override fun filter(filter: FilterProperty) {
      cdkBuilder.filter(filter.let(FilterProperty.Companion::unwrap))
    }

    /**
     * This property contains the criteria for the Storage Lens group data that is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
     * @param filter This property contains the criteria for the Storage Lens group data that is
     * displayed. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c34696e4ff5fce73c11267bb9ecec49746863e32f72ce78d842b72a32fc8d70")
    override fun filter(filter: FilterProperty.Builder.() -> Unit): Unit =
        filter(FilterProperty(filter))

    /**
     * This property contains the Storage Lens group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-name)
     * @param name This property contains the Storage Lens group name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * This property contains the AWS resource tags that you're adding to your Storage Lens group.
     *
     * This parameter is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-tags)
     * @param tags This property contains the AWS resource tags that you're adding to your Storage
     * Lens group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * This property contains the AWS resource tags that you're adding to your Storage Lens group.
     *
     * This parameter is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-tags)
     * @param tags This property contains the AWS resource tags that you're adding to your Storage
     * Lens group. 
     */
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
        software.amazon.awscdk.services.s3.CfnStorageLensGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.s3.CfnStorageLensGroup
  }

  /**
   * This resource is a logical operator that allows multiple filter conditions to be joined for
   * more complex comparisons of Storage Lens group data.
   *
   * Objects must match all of the listed filter conditions that are joined by the `And` logical
   * operator. Only one of each filter condition is allowed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3.*;
   * AndProperty andProperty = AndProperty.builder()
   * .matchAnyPrefix(List.of("matchAnyPrefix"))
   * .matchAnySuffix(List.of("matchAnySuffix"))
   * .matchAnyTag(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .matchObjectAge(MatchObjectAgeProperty.builder()
   * .daysGreaterThan(123)
   * .daysLessThan(123)
   * .build())
   * .matchObjectSize(MatchObjectSizeProperty.builder()
   * .bytesGreaterThan(123)
   * .bytesLessThan(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html)
   */
  public interface AndProperty {
    /**
     * This property contains a list of prefixes.
     *
     * At least one prefix must be specified. Up to 10 prefixes are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchanyprefix)
     */
    public fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

    /**
     * This property contains a list of suffixes.
     *
     * At least one suffix must be specified. Up to 10 suffixes are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchanysuffix)
     */
    public fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

    /**
     * This property contains the list of object tags.
     *
     * At least one object tag must be specified. Up to 10 object tags are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchanytag)
     */
    public fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

    /**
     * This property contains `DaysGreaterThan` and `DaysLessThan` properties to define the object
     * age range (minimum and maximum number of days).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchobjectage)
     */
    public fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

    /**
     * This property contains `BytesGreaterThan` and `BytesLessThan` to define the object size range
     * (minimum and maximum number of Bytes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchobjectsize)
     */
    public fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

    /**
     * A builder for [AndProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param matchAnyPrefix This property contains a list of prefixes.
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       */
      public fun matchAnyPrefix(matchAnyPrefix: List<String>)

      /**
       * @param matchAnyPrefix This property contains a list of prefixes.
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       */
      public fun matchAnyPrefix(vararg matchAnyPrefix: String)

      /**
       * @param matchAnySuffix This property contains a list of suffixes.
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       */
      public fun matchAnySuffix(matchAnySuffix: List<String>)

      /**
       * @param matchAnySuffix This property contains a list of suffixes.
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       */
      public fun matchAnySuffix(vararg matchAnySuffix: String)

      /**
       * @param matchAnyTag This property contains the list of object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      public fun matchAnyTag(matchAnyTag: IResolvable)

      /**
       * @param matchAnyTag This property contains the list of object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      public fun matchAnyTag(matchAnyTag: List<Any>)

      /**
       * @param matchAnyTag This property contains the list of object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      public fun matchAnyTag(vararg matchAnyTag: Any)

      /**
       * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan`
       * properties to define the object age range (minimum and maximum number of days).
       */
      public fun matchObjectAge(matchObjectAge: IResolvable)

      /**
       * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan`
       * properties to define the object age range (minimum and maximum number of days).
       */
      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty)

      /**
       * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan`
       * properties to define the object age range (minimum and maximum number of days).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21a4fa559dd0f84f70eb21b6acabd82bd3fab9b7a2d33266d9d1c2f0808e3bdf")
      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit)

      /**
       * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
       * define the object size range (minimum and maximum number of Bytes).
       */
      public fun matchObjectSize(matchObjectSize: IResolvable)

      /**
       * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
       * define the object size range (minimum and maximum number of Bytes).
       */
      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty)

      /**
       * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
       * define the object size range (minimum and maximum number of Bytes).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("398b5e25549a7d2a421e6d3dce560942f00e9340306175234463ccbfc9696d0e")
      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty.builder()

      /**
       * @param matchAnyPrefix This property contains a list of prefixes.
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       */
      override fun matchAnyPrefix(matchAnyPrefix: List<String>) {
        cdkBuilder.matchAnyPrefix(matchAnyPrefix)
      }

      /**
       * @param matchAnyPrefix This property contains a list of prefixes.
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       */
      override fun matchAnyPrefix(vararg matchAnyPrefix: String): Unit =
          matchAnyPrefix(matchAnyPrefix.toList())

      /**
       * @param matchAnySuffix This property contains a list of suffixes.
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       */
      override fun matchAnySuffix(matchAnySuffix: List<String>) {
        cdkBuilder.matchAnySuffix(matchAnySuffix)
      }

      /**
       * @param matchAnySuffix This property contains a list of suffixes.
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       */
      override fun matchAnySuffix(vararg matchAnySuffix: String): Unit =
          matchAnySuffix(matchAnySuffix.toList())

      /**
       * @param matchAnyTag This property contains the list of object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      override fun matchAnyTag(matchAnyTag: IResolvable) {
        cdkBuilder.matchAnyTag(matchAnyTag.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param matchAnyTag This property contains the list of object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      override fun matchAnyTag(matchAnyTag: List<Any>) {
        cdkBuilder.matchAnyTag(matchAnyTag.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param matchAnyTag This property contains the list of object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      override fun matchAnyTag(vararg matchAnyTag: Any): Unit = matchAnyTag(matchAnyTag.toList())

      /**
       * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan`
       * properties to define the object age range (minimum and maximum number of days).
       */
      override fun matchObjectAge(matchObjectAge: IResolvable) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan`
       * properties to define the object age range (minimum and maximum number of days).
       */
      override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(MatchObjectAgeProperty.Companion::unwrap))
      }

      /**
       * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan`
       * properties to define the object age range (minimum and maximum number of days).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21a4fa559dd0f84f70eb21b6acabd82bd3fab9b7a2d33266d9d1c2f0808e3bdf")
      override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit): Unit =
          matchObjectAge(MatchObjectAgeProperty(matchObjectAge))

      /**
       * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
       * define the object size range (minimum and maximum number of Bytes).
       */
      override fun matchObjectSize(matchObjectSize: IResolvable) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
       * define the object size range (minimum and maximum number of Bytes).
       */
      override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(MatchObjectSizeProperty.Companion::unwrap))
      }

      /**
       * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
       * define the object size range (minimum and maximum number of Bytes).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("398b5e25549a7d2a421e6d3dce560942f00e9340306175234463ccbfc9696d0e")
      override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit):
          Unit = matchObjectSize(MatchObjectSizeProperty(matchObjectSize))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty,
    ) : CdkObject(cdkObject), AndProperty {
      /**
       * This property contains a list of prefixes.
       *
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchanyprefix)
       */
      override fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

      /**
       * This property contains a list of suffixes.
       *
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchanysuffix)
       */
      override fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

      /**
       * This property contains the list of object tags.
       *
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchanytag)
       */
      override fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

      /**
       * This property contains `DaysGreaterThan` and `DaysLessThan` properties to define the object
       * age range (minimum and maximum number of days).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchobjectage)
       */
      override fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

      /**
       * This property contains `BytesGreaterThan` and `BytesLessThan` to define the object size
       * range (minimum and maximum number of Bytes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchobjectsize)
       */
      override fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AndProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty):
          AndProperty = CdkObjectWrappers.wrap(cdkObject) as? AndProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AndProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty
    }
  }

  /**
   * This resource sets the criteria for the Storage Lens group data that is displayed.
   *
   * For multiple filter conditions, the `AND` or `OR` logical operator is used.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3.*;
   * FilterProperty filterProperty = FilterProperty.builder()
   * .and(AndProperty.builder()
   * .matchAnyPrefix(List.of("matchAnyPrefix"))
   * .matchAnySuffix(List.of("matchAnySuffix"))
   * .matchAnyTag(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .matchObjectAge(MatchObjectAgeProperty.builder()
   * .daysGreaterThan(123)
   * .daysLessThan(123)
   * .build())
   * .matchObjectSize(MatchObjectSizeProperty.builder()
   * .bytesGreaterThan(123)
   * .bytesLessThan(123)
   * .build())
   * .build())
   * .matchAnyPrefix(List.of("matchAnyPrefix"))
   * .matchAnySuffix(List.of("matchAnySuffix"))
   * .matchAnyTag(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .matchObjectAge(MatchObjectAgeProperty.builder()
   * .daysGreaterThan(123)
   * .daysLessThan(123)
   * .build())
   * .matchObjectSize(MatchObjectSizeProperty.builder()
   * .bytesGreaterThan(123)
   * .bytesLessThan(123)
   * .build())
   * .or(OrProperty.builder()
   * .matchAnyPrefix(List.of("matchAnyPrefix"))
   * .matchAnySuffix(List.of("matchAnySuffix"))
   * .matchAnyTag(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .matchObjectAge(MatchObjectAgeProperty.builder()
   * .daysGreaterThan(123)
   * .daysLessThan(123)
   * .build())
   * .matchObjectSize(MatchObjectSizeProperty.builder()
   * .bytesGreaterThan(123)
   * .bytesLessThan(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html)
   */
  public interface FilterProperty {
    /**
     * This property contains the `And` logical operator, which allows multiple filter conditions to
     * be joined for more complex comparisons of Storage Lens group data.
     *
     * Objects must match all of the listed filter conditions that are joined by the `And` logical
     * operator. Only one of each filter condition is allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-and)
     */
    public fun and(): Any? = unwrap(this).getAnd()

    /**
     * This property contains a list of prefixes.
     *
     * At least one prefix must be specified. Up to 10 prefixes are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchanyprefix)
     */
    public fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

    /**
     * This property contains a list of suffixes.
     *
     * At least one suffix must be specified. Up to 10 suffixes are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchanysuffix)
     */
    public fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

    /**
     * This property contains the list of S3 object tags.
     *
     * At least one object tag must be specified. Up to 10 object tags are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchanytag)
     */
    public fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

    /**
     * This property contains `DaysGreaterThan` and `DaysLessThan` to define the object age range
     * (minimum and maximum number of days).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchobjectage)
     */
    public fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

    /**
     * This property contains `BytesGreaterThan` and `BytesLessThan` to define the object size range
     * (minimum and maximum number of Bytes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchobjectsize)
     */
    public fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

    /**
     * This property contains the `Or` logical operator, which allows multiple filter conditions to
     * be joined.
     *
     * Objects can match any of the listed filter conditions, which are joined by the `Or` logical
     * operator. Only one of each filter condition is allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-or)
     */
    public fun or(): Any? = unwrap(this).getOr()

    /**
     * A builder for [FilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param and This property contains the `And` logical operator, which allows multiple filter
       * conditions to be joined for more complex comparisons of Storage Lens group data.
       * Objects must match all of the listed filter conditions that are joined by the `And` logical
       * operator. Only one of each filter condition is allowed.
       */
      public fun and(and: IResolvable)

      /**
       * @param and This property contains the `And` logical operator, which allows multiple filter
       * conditions to be joined for more complex comparisons of Storage Lens group data.
       * Objects must match all of the listed filter conditions that are joined by the `And` logical
       * operator. Only one of each filter condition is allowed.
       */
      public fun and(and: AndProperty)

      /**
       * @param and This property contains the `And` logical operator, which allows multiple filter
       * conditions to be joined for more complex comparisons of Storage Lens group data.
       * Objects must match all of the listed filter conditions that are joined by the `And` logical
       * operator. Only one of each filter condition is allowed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8259494a2cacbf55c2d9eecc3c1db3f0c42e4d2fad18f33631bfe3dce54bd1de")
      public fun and(and: AndProperty.Builder.() -> Unit)

      /**
       * @param matchAnyPrefix This property contains a list of prefixes.
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       */
      public fun matchAnyPrefix(matchAnyPrefix: List<String>)

      /**
       * @param matchAnyPrefix This property contains a list of prefixes.
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       */
      public fun matchAnyPrefix(vararg matchAnyPrefix: String)

      /**
       * @param matchAnySuffix This property contains a list of suffixes.
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       */
      public fun matchAnySuffix(matchAnySuffix: List<String>)

      /**
       * @param matchAnySuffix This property contains a list of suffixes.
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       */
      public fun matchAnySuffix(vararg matchAnySuffix: String)

      /**
       * @param matchAnyTag This property contains the list of S3 object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      public fun matchAnyTag(matchAnyTag: IResolvable)

      /**
       * @param matchAnyTag This property contains the list of S3 object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      public fun matchAnyTag(matchAnyTag: List<Any>)

      /**
       * @param matchAnyTag This property contains the list of S3 object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      public fun matchAnyTag(vararg matchAnyTag: Any)

      /**
       * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` to define
       * the object age range (minimum and maximum number of days).
       */
      public fun matchObjectAge(matchObjectAge: IResolvable)

      /**
       * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` to define
       * the object age range (minimum and maximum number of days).
       */
      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty)

      /**
       * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` to define
       * the object age range (minimum and maximum number of days).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a55b3de097cb341cba35867de233fbd2f4652512602b74359191714147a4418")
      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit)

      /**
       * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
       * define the object size range (minimum and maximum number of Bytes).
       */
      public fun matchObjectSize(matchObjectSize: IResolvable)

      /**
       * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
       * define the object size range (minimum and maximum number of Bytes).
       */
      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty)

      /**
       * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
       * define the object size range (minimum and maximum number of Bytes).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4a34bb12ec372dd70248acf7014788636043e222d8596e1031f7067a18536f8")
      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit)

      /**
       * @param or This property contains the `Or` logical operator, which allows multiple filter
       * conditions to be joined.
       * Objects can match any of the listed filter conditions, which are joined by the `Or` logical
       * operator. Only one of each filter condition is allowed.
       */
      public fun or(or: IResolvable)

      /**
       * @param or This property contains the `Or` logical operator, which allows multiple filter
       * conditions to be joined.
       * Objects can match any of the listed filter conditions, which are joined by the `Or` logical
       * operator. Only one of each filter condition is allowed.
       */
      public fun or(or: OrProperty)

      /**
       * @param or This property contains the `Or` logical operator, which allows multiple filter
       * conditions to be joined.
       * Objects can match any of the listed filter conditions, which are joined by the `Or` logical
       * operator. Only one of each filter condition is allowed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1ad32cfb06fa186bf0f70c948c9816acdd24e160a9e1e71efe9ed1928a2096c")
      public fun or(or: OrProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty.builder()

      /**
       * @param and This property contains the `And` logical operator, which allows multiple filter
       * conditions to be joined for more complex comparisons of Storage Lens group data.
       * Objects must match all of the listed filter conditions that are joined by the `And` logical
       * operator. Only one of each filter condition is allowed.
       */
      override fun and(and: IResolvable) {
        cdkBuilder.and(and.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param and This property contains the `And` logical operator, which allows multiple filter
       * conditions to be joined for more complex comparisons of Storage Lens group data.
       * Objects must match all of the listed filter conditions that are joined by the `And` logical
       * operator. Only one of each filter condition is allowed.
       */
      override fun and(and: AndProperty) {
        cdkBuilder.and(and.let(AndProperty.Companion::unwrap))
      }

      /**
       * @param and This property contains the `And` logical operator, which allows multiple filter
       * conditions to be joined for more complex comparisons of Storage Lens group data.
       * Objects must match all of the listed filter conditions that are joined by the `And` logical
       * operator. Only one of each filter condition is allowed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8259494a2cacbf55c2d9eecc3c1db3f0c42e4d2fad18f33631bfe3dce54bd1de")
      override fun and(and: AndProperty.Builder.() -> Unit): Unit = and(AndProperty(and))

      /**
       * @param matchAnyPrefix This property contains a list of prefixes.
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       */
      override fun matchAnyPrefix(matchAnyPrefix: List<String>) {
        cdkBuilder.matchAnyPrefix(matchAnyPrefix)
      }

      /**
       * @param matchAnyPrefix This property contains a list of prefixes.
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       */
      override fun matchAnyPrefix(vararg matchAnyPrefix: String): Unit =
          matchAnyPrefix(matchAnyPrefix.toList())

      /**
       * @param matchAnySuffix This property contains a list of suffixes.
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       */
      override fun matchAnySuffix(matchAnySuffix: List<String>) {
        cdkBuilder.matchAnySuffix(matchAnySuffix)
      }

      /**
       * @param matchAnySuffix This property contains a list of suffixes.
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       */
      override fun matchAnySuffix(vararg matchAnySuffix: String): Unit =
          matchAnySuffix(matchAnySuffix.toList())

      /**
       * @param matchAnyTag This property contains the list of S3 object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      override fun matchAnyTag(matchAnyTag: IResolvable) {
        cdkBuilder.matchAnyTag(matchAnyTag.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param matchAnyTag This property contains the list of S3 object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      override fun matchAnyTag(matchAnyTag: List<Any>) {
        cdkBuilder.matchAnyTag(matchAnyTag.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param matchAnyTag This property contains the list of S3 object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      override fun matchAnyTag(vararg matchAnyTag: Any): Unit = matchAnyTag(matchAnyTag.toList())

      /**
       * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` to define
       * the object age range (minimum and maximum number of days).
       */
      override fun matchObjectAge(matchObjectAge: IResolvable) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` to define
       * the object age range (minimum and maximum number of days).
       */
      override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(MatchObjectAgeProperty.Companion::unwrap))
      }

      /**
       * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` to define
       * the object age range (minimum and maximum number of days).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a55b3de097cb341cba35867de233fbd2f4652512602b74359191714147a4418")
      override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit): Unit =
          matchObjectAge(MatchObjectAgeProperty(matchObjectAge))

      /**
       * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
       * define the object size range (minimum and maximum number of Bytes).
       */
      override fun matchObjectSize(matchObjectSize: IResolvable) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
       * define the object size range (minimum and maximum number of Bytes).
       */
      override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(MatchObjectSizeProperty.Companion::unwrap))
      }

      /**
       * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
       * define the object size range (minimum and maximum number of Bytes).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4a34bb12ec372dd70248acf7014788636043e222d8596e1031f7067a18536f8")
      override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit):
          Unit = matchObjectSize(MatchObjectSizeProperty(matchObjectSize))

      /**
       * @param or This property contains the `Or` logical operator, which allows multiple filter
       * conditions to be joined.
       * Objects can match any of the listed filter conditions, which are joined by the `Or` logical
       * operator. Only one of each filter condition is allowed.
       */
      override fun or(or: IResolvable) {
        cdkBuilder.or(or.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param or This property contains the `Or` logical operator, which allows multiple filter
       * conditions to be joined.
       * Objects can match any of the listed filter conditions, which are joined by the `Or` logical
       * operator. Only one of each filter condition is allowed.
       */
      override fun or(or: OrProperty) {
        cdkBuilder.or(or.let(OrProperty.Companion::unwrap))
      }

      /**
       * @param or This property contains the `Or` logical operator, which allows multiple filter
       * conditions to be joined.
       * Objects can match any of the listed filter conditions, which are joined by the `Or` logical
       * operator. Only one of each filter condition is allowed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1ad32cfb06fa186bf0f70c948c9816acdd24e160a9e1e71efe9ed1928a2096c")
      override fun or(or: OrProperty.Builder.() -> Unit): Unit = or(OrProperty(or))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      /**
       * This property contains the `And` logical operator, which allows multiple filter conditions
       * to be joined for more complex comparisons of Storage Lens group data.
       *
       * Objects must match all of the listed filter conditions that are joined by the `And` logical
       * operator. Only one of each filter condition is allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-and)
       */
      override fun and(): Any? = unwrap(this).getAnd()

      /**
       * This property contains a list of prefixes.
       *
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchanyprefix)
       */
      override fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

      /**
       * This property contains a list of suffixes.
       *
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchanysuffix)
       */
      override fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

      /**
       * This property contains the list of S3 object tags.
       *
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchanytag)
       */
      override fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

      /**
       * This property contains `DaysGreaterThan` and `DaysLessThan` to define the object age range
       * (minimum and maximum number of days).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchobjectage)
       */
      override fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

      /**
       * This property contains `BytesGreaterThan` and `BytesLessThan` to define the object size
       * range (minimum and maximum number of Bytes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchobjectsize)
       */
      override fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

      /**
       * This property contains the `Or` logical operator, which allows multiple filter conditions
       * to be joined.
       *
       * Objects can match any of the listed filter conditions, which are joined by the `Or` logical
       * operator. Only one of each filter condition is allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-or)
       */
      override fun or(): Any? = unwrap(this).getOr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty):
          FilterProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty
    }
  }

  /**
   * This resource contains `DaysGreaterThan` and `DaysLessThan` to define the object age range
   * (minimum and maximum number of days).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3.*;
   * MatchObjectAgeProperty matchObjectAgeProperty = MatchObjectAgeProperty.builder()
   * .daysGreaterThan(123)
   * .daysLessThan(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectage.html)
   */
  public interface MatchObjectAgeProperty {
    /**
     * This property indicates the minimum object age in days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectage.html#cfn-s3-storagelensgroup-matchobjectage-daysgreaterthan)
     */
    public fun daysGreaterThan(): Number? = unwrap(this).getDaysGreaterThan()

    /**
     * This property indicates the maximum object age in days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectage.html#cfn-s3-storagelensgroup-matchobjectage-dayslessthan)
     */
    public fun daysLessThan(): Number? = unwrap(this).getDaysLessThan()

    /**
     * A builder for [MatchObjectAgeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param daysGreaterThan This property indicates the minimum object age in days.
       */
      public fun daysGreaterThan(daysGreaterThan: Number)

      /**
       * @param daysLessThan This property indicates the maximum object age in days.
       */
      public fun daysLessThan(daysLessThan: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty.builder()

      /**
       * @param daysGreaterThan This property indicates the minimum object age in days.
       */
      override fun daysGreaterThan(daysGreaterThan: Number) {
        cdkBuilder.daysGreaterThan(daysGreaterThan)
      }

      /**
       * @param daysLessThan This property indicates the maximum object age in days.
       */
      override fun daysLessThan(daysLessThan: Number) {
        cdkBuilder.daysLessThan(daysLessThan)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty,
    ) : CdkObject(cdkObject), MatchObjectAgeProperty {
      /**
       * This property indicates the minimum object age in days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectage.html#cfn-s3-storagelensgroup-matchobjectage-daysgreaterthan)
       */
      override fun daysGreaterThan(): Number? = unwrap(this).getDaysGreaterThan()

      /**
       * This property indicates the maximum object age in days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectage.html#cfn-s3-storagelensgroup-matchobjectage-dayslessthan)
       */
      override fun daysLessThan(): Number? = unwrap(this).getDaysLessThan()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchObjectAgeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty):
          MatchObjectAgeProperty = CdkObjectWrappers.wrap(cdkObject) as? MatchObjectAgeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchObjectAgeProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty
    }
  }

  /**
   * This resource filters objects that match the specified object size range.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3.*;
   * MatchObjectSizeProperty matchObjectSizeProperty = MatchObjectSizeProperty.builder()
   * .bytesGreaterThan(123)
   * .bytesLessThan(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectsize.html)
   */
  public interface MatchObjectSizeProperty {
    /**
     * This property specifies the minimum object size in bytes.
     *
     * The value must be a positive number, greater than 0 and less than 5 TB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectsize.html#cfn-s3-storagelensgroup-matchobjectsize-bytesgreaterthan)
     */
    public fun bytesGreaterThan(): Number? = unwrap(this).getBytesGreaterThan()

    /**
     * This property specifies the maximum object size in bytes.
     *
     * The value must be a positive number, greater than the minimum object size and less than 5 TB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectsize.html#cfn-s3-storagelensgroup-matchobjectsize-byteslessthan)
     */
    public fun bytesLessThan(): Number? = unwrap(this).getBytesLessThan()

    /**
     * A builder for [MatchObjectSizeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bytesGreaterThan This property specifies the minimum object size in bytes.
       * The value must be a positive number, greater than 0 and less than 5 TB.
       */
      public fun bytesGreaterThan(bytesGreaterThan: Number)

      /**
       * @param bytesLessThan This property specifies the maximum object size in bytes.
       * The value must be a positive number, greater than the minimum object size and less than 5
       * TB.
       */
      public fun bytesLessThan(bytesLessThan: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty.builder()

      /**
       * @param bytesGreaterThan This property specifies the minimum object size in bytes.
       * The value must be a positive number, greater than 0 and less than 5 TB.
       */
      override fun bytesGreaterThan(bytesGreaterThan: Number) {
        cdkBuilder.bytesGreaterThan(bytesGreaterThan)
      }

      /**
       * @param bytesLessThan This property specifies the maximum object size in bytes.
       * The value must be a positive number, greater than the minimum object size and less than 5
       * TB.
       */
      override fun bytesLessThan(bytesLessThan: Number) {
        cdkBuilder.bytesLessThan(bytesLessThan)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty,
    ) : CdkObject(cdkObject), MatchObjectSizeProperty {
      /**
       * This property specifies the minimum object size in bytes.
       *
       * The value must be a positive number, greater than 0 and less than 5 TB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectsize.html#cfn-s3-storagelensgroup-matchobjectsize-bytesgreaterthan)
       */
      override fun bytesGreaterThan(): Number? = unwrap(this).getBytesGreaterThan()

      /**
       * This property specifies the maximum object size in bytes.
       *
       * The value must be a positive number, greater than the minimum object size and less than 5
       * TB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectsize.html#cfn-s3-storagelensgroup-matchobjectsize-byteslessthan)
       */
      override fun bytesLessThan(): Number? = unwrap(this).getBytesLessThan()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchObjectSizeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty):
          MatchObjectSizeProperty = CdkObjectWrappers.wrap(cdkObject) as? MatchObjectSizeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchObjectSizeProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty
    }
  }

  /**
   * This resource contains the `Or` logical operator, which allows multiple filter conditions to be
   * joined for more complex comparisons of Storage Lens group data.
   *
   * Objects can match any of the listed filter conditions that are joined by the `Or` logical
   * operator. Only one of each filter condition is allowed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3.*;
   * OrProperty orProperty = OrProperty.builder()
   * .matchAnyPrefix(List.of("matchAnyPrefix"))
   * .matchAnySuffix(List.of("matchAnySuffix"))
   * .matchAnyTag(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .matchObjectAge(MatchObjectAgeProperty.builder()
   * .daysGreaterThan(123)
   * .daysLessThan(123)
   * .build())
   * .matchObjectSize(MatchObjectSizeProperty.builder()
   * .bytesGreaterThan(123)
   * .bytesLessThan(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html)
   */
  public interface OrProperty {
    /**
     * This property contains a list of prefixes.
     *
     * At least one prefix must be specified. Up to 10 prefixes are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchanyprefix)
     */
    public fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

    /**
     * This property contains the list of suffixes.
     *
     * At least one suffix must be specified. Up to 10 suffixes are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchanysuffix)
     */
    public fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

    /**
     * This property contains the list of S3 object tags.
     *
     * At least one object tag must be specified. Up to 10 object tags are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchanytag)
     */
    public fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

    /**
     * This property filters objects that match the specified object age range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchobjectage)
     */
    public fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

    /**
     * This property contains the `BytesGreaterThan` and `BytesLessThan` values to define the object
     * size range (minimum and maximum number of Bytes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchobjectsize)
     */
    public fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

    /**
     * A builder for [OrProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param matchAnyPrefix This property contains a list of prefixes.
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       */
      public fun matchAnyPrefix(matchAnyPrefix: List<String>)

      /**
       * @param matchAnyPrefix This property contains a list of prefixes.
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       */
      public fun matchAnyPrefix(vararg matchAnyPrefix: String)

      /**
       * @param matchAnySuffix This property contains the list of suffixes.
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       */
      public fun matchAnySuffix(matchAnySuffix: List<String>)

      /**
       * @param matchAnySuffix This property contains the list of suffixes.
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       */
      public fun matchAnySuffix(vararg matchAnySuffix: String)

      /**
       * @param matchAnyTag This property contains the list of S3 object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      public fun matchAnyTag(matchAnyTag: IResolvable)

      /**
       * @param matchAnyTag This property contains the list of S3 object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      public fun matchAnyTag(matchAnyTag: List<Any>)

      /**
       * @param matchAnyTag This property contains the list of S3 object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      public fun matchAnyTag(vararg matchAnyTag: Any)

      /**
       * @param matchObjectAge This property filters objects that match the specified object age
       * range.
       */
      public fun matchObjectAge(matchObjectAge: IResolvable)

      /**
       * @param matchObjectAge This property filters objects that match the specified object age
       * range.
       */
      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty)

      /**
       * @param matchObjectAge This property filters objects that match the specified object age
       * range.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a611e8c260bba330a653a4a57fb9660ce8017b0b680152393b1f320391b3abc")
      public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit)

      /**
       * @param matchObjectSize This property contains the `BytesGreaterThan` and `BytesLessThan`
       * values to define the object size range (minimum and maximum number of Bytes).
       */
      public fun matchObjectSize(matchObjectSize: IResolvable)

      /**
       * @param matchObjectSize This property contains the `BytesGreaterThan` and `BytesLessThan`
       * values to define the object size range (minimum and maximum number of Bytes).
       */
      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty)

      /**
       * @param matchObjectSize This property contains the `BytesGreaterThan` and `BytesLessThan`
       * values to define the object size range (minimum and maximum number of Bytes).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5437a1317fee22aeaf320aef20059fe2cee631083400d66afe90ee31b4b5e895")
      public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty.builder()

      /**
       * @param matchAnyPrefix This property contains a list of prefixes.
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       */
      override fun matchAnyPrefix(matchAnyPrefix: List<String>) {
        cdkBuilder.matchAnyPrefix(matchAnyPrefix)
      }

      /**
       * @param matchAnyPrefix This property contains a list of prefixes.
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       */
      override fun matchAnyPrefix(vararg matchAnyPrefix: String): Unit =
          matchAnyPrefix(matchAnyPrefix.toList())

      /**
       * @param matchAnySuffix This property contains the list of suffixes.
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       */
      override fun matchAnySuffix(matchAnySuffix: List<String>) {
        cdkBuilder.matchAnySuffix(matchAnySuffix)
      }

      /**
       * @param matchAnySuffix This property contains the list of suffixes.
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       */
      override fun matchAnySuffix(vararg matchAnySuffix: String): Unit =
          matchAnySuffix(matchAnySuffix.toList())

      /**
       * @param matchAnyTag This property contains the list of S3 object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      override fun matchAnyTag(matchAnyTag: IResolvable) {
        cdkBuilder.matchAnyTag(matchAnyTag.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param matchAnyTag This property contains the list of S3 object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      override fun matchAnyTag(matchAnyTag: List<Any>) {
        cdkBuilder.matchAnyTag(matchAnyTag.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param matchAnyTag This property contains the list of S3 object tags.
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       */
      override fun matchAnyTag(vararg matchAnyTag: Any): Unit = matchAnyTag(matchAnyTag.toList())

      /**
       * @param matchObjectAge This property filters objects that match the specified object age
       * range.
       */
      override fun matchObjectAge(matchObjectAge: IResolvable) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param matchObjectAge This property filters objects that match the specified object age
       * range.
       */
      override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
        cdkBuilder.matchObjectAge(matchObjectAge.let(MatchObjectAgeProperty.Companion::unwrap))
      }

      /**
       * @param matchObjectAge This property filters objects that match the specified object age
       * range.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a611e8c260bba330a653a4a57fb9660ce8017b0b680152393b1f320391b3abc")
      override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit): Unit =
          matchObjectAge(MatchObjectAgeProperty(matchObjectAge))

      /**
       * @param matchObjectSize This property contains the `BytesGreaterThan` and `BytesLessThan`
       * values to define the object size range (minimum and maximum number of Bytes).
       */
      override fun matchObjectSize(matchObjectSize: IResolvable) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param matchObjectSize This property contains the `BytesGreaterThan` and `BytesLessThan`
       * values to define the object size range (minimum and maximum number of Bytes).
       */
      override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
        cdkBuilder.matchObjectSize(matchObjectSize.let(MatchObjectSizeProperty.Companion::unwrap))
      }

      /**
       * @param matchObjectSize This property contains the `BytesGreaterThan` and `BytesLessThan`
       * values to define the object size range (minimum and maximum number of Bytes).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5437a1317fee22aeaf320aef20059fe2cee631083400d66afe90ee31b4b5e895")
      override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit):
          Unit = matchObjectSize(MatchObjectSizeProperty(matchObjectSize))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty,
    ) : CdkObject(cdkObject), OrProperty {
      /**
       * This property contains a list of prefixes.
       *
       * At least one prefix must be specified. Up to 10 prefixes are allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchanyprefix)
       */
      override fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

      /**
       * This property contains the list of suffixes.
       *
       * At least one suffix must be specified. Up to 10 suffixes are allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchanysuffix)
       */
      override fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

      /**
       * This property contains the list of S3 object tags.
       *
       * At least one object tag must be specified. Up to 10 object tags are allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchanytag)
       */
      override fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

      /**
       * This property filters objects that match the specified object age range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchobjectage)
       */
      override fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

      /**
       * This property contains the `BytesGreaterThan` and `BytesLessThan` values to define the
       * object size range (minimum and maximum number of Bytes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchobjectsize)
       */
      override fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OrProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty):
          OrProperty = CdkObjectWrappers.wrap(cdkObject) as? OrProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrProperty):
          software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty
    }
  }
}
