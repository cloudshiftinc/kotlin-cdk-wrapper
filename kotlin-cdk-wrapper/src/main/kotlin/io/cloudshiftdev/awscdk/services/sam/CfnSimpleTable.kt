@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlesssimpletable.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sam.*;
 * CfnSimpleTable cfnSimpleTable = CfnSimpleTable.Builder.create(this, "MyCfnSimpleTable")
 * .primaryKey(PrimaryKeyProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .name("name")
 * .build())
 * .provisionedThroughput(ProvisionedThroughputProperty.builder()
 * .writeCapacityUnits(123)
 * // the properties below are optional
 * .readCapacityUnits(123)
 * .build())
 * .sseSpecification(SSESpecificationProperty.builder()
 * .sseEnabled(false)
 * .build())
 * .tableName("tableName")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html)
 */
public open class CfnSimpleTable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTable,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   *
   */
  public open fun primaryKey(): Any? = unwrap(this).getPrimaryKey()

  /**
   *
   */
  public open fun primaryKey(`value`: IResolvable) {
    unwrap(this).setPrimaryKey(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun primaryKey(`value`: PrimaryKeyProperty) {
    unwrap(this).setPrimaryKey(`value`.let(PrimaryKeyProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eb68715cdfb9dab8fa19c369e0c702b827e601bd03a92664fba07c6a2848022f")
  public open fun primaryKey(`value`: PrimaryKeyProperty.Builder.() -> Unit): Unit =
      primaryKey(PrimaryKeyProperty(`value`))

  /**
   *
   */
  public open fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

  /**
   *
   */
  public open fun provisionedThroughput(`value`: IResolvable) {
    unwrap(this).setProvisionedThroughput(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun provisionedThroughput(`value`: ProvisionedThroughputProperty) {
    unwrap(this).setProvisionedThroughput(`value`.let(ProvisionedThroughputProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("043aa132c3d356bc7170b4e5904926d95e402968dfaa379b1748536e6a6e2dba")
  public open fun provisionedThroughput(`value`: ProvisionedThroughputProperty.Builder.() -> Unit):
      Unit = provisionedThroughput(ProvisionedThroughputProperty(`value`))

  /**
   *
   */
  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   *
   */
  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun sseSpecification(`value`: SSESpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SSESpecificationProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("67673f532fb7b0a8a4bce9874c5f6ccc738292de92107c11c9c819f2553221f2")
  public open fun sseSpecification(`value`: SSESpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SSESpecificationProperty(`value`))

  /**
   *
   */
  public open fun tableName(): String? = unwrap(this).getTableName()

  /**
   *
   */
  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   *
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   *
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sam.CfnSimpleTable].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-primarykey)
     * @param primaryKey 
     */
    public fun primaryKey(primaryKey: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-primarykey)
     * @param primaryKey 
     */
    public fun primaryKey(primaryKey: PrimaryKeyProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-primarykey)
     * @param primaryKey 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee6b7873d058d3bb454df3c71cf29aa37e1b1fbf3f3ef8ac229f5a6201aab6f8")
    public fun primaryKey(primaryKey: PrimaryKeyProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-provisionedthroughput)
     * @param provisionedThroughput 
     */
    public fun provisionedThroughput(provisionedThroughput: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-provisionedthroughput)
     * @param provisionedThroughput 
     */
    public fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-provisionedthroughput)
     * @param provisionedThroughput 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54030f74ed583ac27ecc9c42b817af6e83602f7d08765c2442e7f8ed70c92655")
    public
        fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-ssespecification)
     * @param sseSpecification 
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-ssespecification)
     * @param sseSpecification 
     */
    public fun sseSpecification(sseSpecification: SSESpecificationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-ssespecification)
     * @param sseSpecification 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("308875bca1ffe1a060923c76d3b60424613be8c4c737a576c2dd8a68fcec16ee")
    public fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-tablename)
     * @param tableName 
     */
    public fun tableName(tableName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-tags)
     * @param tags 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnSimpleTable.Builder =
        software.amazon.awscdk.services.sam.CfnSimpleTable.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-primarykey)
     * @param primaryKey 
     */
    override fun primaryKey(primaryKey: IResolvable) {
      cdkBuilder.primaryKey(primaryKey.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-primarykey)
     * @param primaryKey 
     */
    override fun primaryKey(primaryKey: PrimaryKeyProperty) {
      cdkBuilder.primaryKey(primaryKey.let(PrimaryKeyProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-primarykey)
     * @param primaryKey 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee6b7873d058d3bb454df3c71cf29aa37e1b1fbf3f3ef8ac229f5a6201aab6f8")
    override fun primaryKey(primaryKey: PrimaryKeyProperty.Builder.() -> Unit): Unit =
        primaryKey(PrimaryKeyProperty(primaryKey))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-provisionedthroughput)
     * @param provisionedThroughput 
     */
    override fun provisionedThroughput(provisionedThroughput: IResolvable) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-provisionedthroughput)
     * @param provisionedThroughput 
     */
    override fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(ProvisionedThroughputProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-provisionedthroughput)
     * @param provisionedThroughput 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54030f74ed583ac27ecc9c42b817af6e83602f7d08765c2442e7f8ed70c92655")
    override
        fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit):
        Unit = provisionedThroughput(ProvisionedThroughputProperty(provisionedThroughput))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-ssespecification)
     * @param sseSpecification 
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-ssespecification)
     * @param sseSpecification 
     */
    override fun sseSpecification(sseSpecification: SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SSESpecificationProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-ssespecification)
     * @param sseSpecification 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("308875bca1ffe1a060923c76d3b60424613be8c4c737a576c2dd8a68fcec16ee")
    override fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(SSESpecificationProperty(sseSpecification))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-tablename)
     * @param tableName 
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-tags)
     * @param tags 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnSimpleTable = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sam.CfnSimpleTable.CFN_RESOURCE_TYPE_NAME

    public val REQUIRED_TRANSFORM: String =
        software.amazon.awscdk.services.sam.CfnSimpleTable.REQUIRED_TRANSFORM

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSimpleTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSimpleTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTable): CfnSimpleTable
        = CfnSimpleTable(cdkObject)

    internal fun unwrap(wrapped: CfnSimpleTable): software.amazon.awscdk.services.sam.CfnSimpleTable
        = wrapped.cdkObject
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * ProvisionedThroughputProperty provisionedThroughputProperty =
   * ProvisionedThroughputProperty.builder()
   * .writeCapacityUnits(123)
   * // the properties below are optional
   * .readCapacityUnits(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-provisionedthroughput.html)
   */
  public interface ProvisionedThroughputProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-provisionedthroughput.html#cfn-serverless-simpletable-provisionedthroughput-readcapacityunits)
     */
    public fun readCapacityUnits(): Number? = unwrap(this).getReadCapacityUnits()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-provisionedthroughput.html#cfn-serverless-simpletable-provisionedthroughput-writecapacityunits)
     */
    public fun writeCapacityUnits(): Number

    /**
     * A builder for [ProvisionedThroughputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param readCapacityUnits the value to be set.
       */
      public fun readCapacityUnits(readCapacityUnits: Number)

      /**
       * @param writeCapacityUnits the value to be set. 
       */
      public fun writeCapacityUnits(writeCapacityUnits: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty.Builder =
          software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty.builder()

      /**
       * @param readCapacityUnits the value to be set.
       */
      override fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
      }

      /**
       * @param writeCapacityUnits the value to be set. 
       */
      override fun writeCapacityUnits(writeCapacityUnits: Number) {
        cdkBuilder.writeCapacityUnits(writeCapacityUnits)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty,
    ) : CdkObject(cdkObject), ProvisionedThroughputProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-provisionedthroughput.html#cfn-serverless-simpletable-provisionedthroughput-readcapacityunits)
       */
      override fun readCapacityUnits(): Number? = unwrap(this).getReadCapacityUnits()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-provisionedthroughput.html#cfn-serverless-simpletable-provisionedthroughput-writecapacityunits)
       */
      override fun writeCapacityUnits(): Number = unwrap(this).getWriteCapacityUnits()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedThroughputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty):
          ProvisionedThroughputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedThroughputProperty):
          software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * PrimaryKeyProperty primaryKeyProperty = PrimaryKeyProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-primarykey.html)
   */
  public interface PrimaryKeyProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-primarykey.html#cfn-serverless-simpletable-primarykey-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-primarykey.html#cfn-serverless-simpletable-primarykey-type)
     */
    public fun type(): String

    /**
     * A builder for [PrimaryKeyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name the value to be set.
       */
      public fun name(name: String)

      /**
       * @param type the value to be set. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.Builder =
          software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.builder()

      /**
       * @param name the value to be set.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type the value to be set. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty,
    ) : CdkObject(cdkObject), PrimaryKeyProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-primarykey.html#cfn-serverless-simpletable-primarykey-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-primarykey.html#cfn-serverless-simpletable-primarykey-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrimaryKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty):
          PrimaryKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrimaryKeyProperty):
          software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * SSESpecificationProperty sSESpecificationProperty = SSESpecificationProperty.builder()
   * .sseEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-ssespecification.html)
   */
  public interface SSESpecificationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-ssespecification.html#cfn-serverless-simpletable-ssespecification-sseenabled)
     */
    public fun sseEnabled(): Any? = unwrap(this).getSseEnabled()

    /**
     * A builder for [SSESpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sseEnabled the value to be set.
       */
      public fun sseEnabled(sseEnabled: Boolean)

      /**
       * @param sseEnabled the value to be set.
       */
      public fun sseEnabled(sseEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty.builder()

      /**
       * @param sseEnabled the value to be set.
       */
      override fun sseEnabled(sseEnabled: Boolean) {
        cdkBuilder.sseEnabled(sseEnabled)
      }

      /**
       * @param sseEnabled the value to be set.
       */
      override fun sseEnabled(sseEnabled: IResolvable) {
        cdkBuilder.sseEnabled(sseEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty,
    ) : CdkObject(cdkObject), SSESpecificationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-ssespecification.html#cfn-serverless-simpletable-ssespecification-sseenabled)
       */
      override fun sseEnabled(): Any? = unwrap(this).getSseEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SSESpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty):
          SSESpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SSESpecificationProperty):
          software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty
    }
  }
}
