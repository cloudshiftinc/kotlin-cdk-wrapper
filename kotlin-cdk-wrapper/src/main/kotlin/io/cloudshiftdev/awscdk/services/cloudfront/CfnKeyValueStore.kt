@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The key value store.
 *
 * Use this to separate data from function code, allowing you to update data without having to
 * publish a new version of a function. The key value store holds keys and their corresponding values.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnKeyValueStore cfnKeyValueStore = CfnKeyValueStore.Builder.create(this, "MyCfnKeyValueStore")
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .importSource(ImportSourceProperty.builder()
 * .sourceArn("sourceArn")
 * .sourceType("sourceType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html)
 */
public open class CfnKeyValueStore(
  cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyValueStore,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKeyValueStoreProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.CfnKeyValueStore(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnKeyValueStoreProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKeyValueStoreProps.Builder.() -> Unit,
  ) : this(scope, id, CfnKeyValueStoreProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the key value store.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique Id for the key value store.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The current status of the key value store.
   *
   * For more information, see [Key value store
   * statuses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/kvs-with-functions-create.html#key-value-store-status)
   * in the *.*
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * A comment for the key value store.
   */
  public open fun comment(): String? = unwrap(this).getComment()

  /**
   * A comment for the key value store.
   */
  public open fun comment(`value`: String) {
    unwrap(this).setComment(`value`)
  }

  /**
   * The import source for the key value store.
   */
  public open fun importSource(): Any? = unwrap(this).getImportSource()

  /**
   * The import source for the key value store.
   */
  public open fun importSource(`value`: IResolvable) {
    unwrap(this).setImportSource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The import source for the key value store.
   */
  public open fun importSource(`value`: ImportSourceProperty) {
    unwrap(this).setImportSource(`value`.let(ImportSourceProperty.Companion::unwrap))
  }

  /**
   * The import source for the key value store.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("be46ab132bf05fa3959b21248478064d4e12271c98f26ed3a3acd4f91fda6528")
  public open fun importSource(`value`: ImportSourceProperty.Builder.() -> Unit): Unit =
      importSource(ImportSourceProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the key value store.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the key value store.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnKeyValueStore].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A comment for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-comment)
     * @param comment A comment for the key value store. 
     */
    public fun comment(comment: String)

    /**
     * The import source for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-importsource)
     * @param importSource The import source for the key value store. 
     */
    public fun importSource(importSource: IResolvable)

    /**
     * The import source for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-importsource)
     * @param importSource The import source for the key value store. 
     */
    public fun importSource(importSource: ImportSourceProperty)

    /**
     * The import source for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-importsource)
     * @param importSource The import source for the key value store. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e23f3a7caff7bb94ad582cd5f164ed195bd067efa764be9a366e6adcf12ca5b4")
    public fun importSource(importSource: ImportSourceProperty.Builder.() -> Unit)

    /**
     * The name of the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-name)
     * @param name The name of the key value store. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.Builder =
        software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.Builder.create(scope, id)

    /**
     * A comment for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-comment)
     * @param comment A comment for the key value store. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * The import source for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-importsource)
     * @param importSource The import source for the key value store. 
     */
    override fun importSource(importSource: IResolvable) {
      cdkBuilder.importSource(importSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * The import source for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-importsource)
     * @param importSource The import source for the key value store. 
     */
    override fun importSource(importSource: ImportSourceProperty) {
      cdkBuilder.importSource(importSource.let(ImportSourceProperty.Companion::unwrap))
    }

    /**
     * The import source for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-importsource)
     * @param importSource The import source for the key value store. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e23f3a7caff7bb94ad582cd5f164ed195bd067efa764be9a366e6adcf12ca5b4")
    override fun importSource(importSource: ImportSourceProperty.Builder.() -> Unit): Unit =
        importSource(ImportSourceProperty(importSource))

    /**
     * The name of the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-name)
     * @param name The name of the key value store. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnKeyValueStore =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.cloudfront.CfnKeyValueStore = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnKeyValueStore
  }

  /**
   * The import source for the key value store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * ImportSourceProperty importSourceProperty = ImportSourceProperty.builder()
   * .sourceArn("sourceArn")
   * .sourceType("sourceType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keyvaluestore-importsource.html)
   */
  public interface ImportSourceProperty {
    /**
     * The Amazon Resource Name (ARN) of the import source for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keyvaluestore-importsource.html#cfn-cloudfront-keyvaluestore-importsource-sourcearn)
     */
    public fun sourceArn(): String

    /**
     * The source type of the import source for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keyvaluestore-importsource.html#cfn-cloudfront-keyvaluestore-importsource-sourcetype)
     */
    public fun sourceType(): String

    /**
     * A builder for [ImportSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceArn The Amazon Resource Name (ARN) of the import source for the key value
       * store. 
       */
      public fun sourceArn(sourceArn: String)

      /**
       * @param sourceType The source type of the import source for the key value store. 
       */
      public fun sourceType(sourceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty.builder()

      /**
       * @param sourceArn The Amazon Resource Name (ARN) of the import source for the key value
       * store. 
       */
      override fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
      }

      /**
       * @param sourceType The source type of the import source for the key value store. 
       */
      override fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty,
    ) : CdkObject(cdkObject),
        ImportSourceProperty {
      /**
       * The Amazon Resource Name (ARN) of the import source for the key value store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keyvaluestore-importsource.html#cfn-cloudfront-keyvaluestore-importsource-sourcearn)
       */
      override fun sourceArn(): String = unwrap(this).getSourceArn()

      /**
       * The source type of the import source for the key value store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keyvaluestore-importsource.html#cfn-cloudfront-keyvaluestore-importsource-sourcetype)
       */
      override fun sourceType(): String = unwrap(this).getSourceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImportSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty):
          ImportSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? ImportSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImportSourceProperty):
          software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnKeyValueStore.ImportSourceProperty
    }
  }
}
