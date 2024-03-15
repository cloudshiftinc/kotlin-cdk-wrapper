@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnKeyValueStore`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnKeyValueStoreProps cfnKeyValueStoreProps = CfnKeyValueStoreProps.builder()
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
public interface CfnKeyValueStoreProps {
  /**
   * A comment for the key value store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-comment)
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * The import source for the key value store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-importsource)
   */
  public fun importSource(): Any? = unwrap(this).getImportSource()

  /**
   * The name of the key value store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnKeyValueStoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment A comment for the key value store.
     */
    public fun comment(comment: String)

    /**
     * @param importSource The import source for the key value store.
     */
    public fun importSource(importSource: IResolvable)

    /**
     * @param importSource The import source for the key value store.
     */
    public fun importSource(importSource: CfnKeyValueStore.ImportSourceProperty)

    /**
     * @param importSource The import source for the key value store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("342ef79ef7792553404ebf0fb3fc5b3d7b128a634712be83b6ee47063f52b84e")
    public fun importSource(importSource: CfnKeyValueStore.ImportSourceProperty.Builder.() -> Unit)

    /**
     * @param name The name of the key value store. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps.Builder
        = software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps.builder()

    /**
     * @param comment A comment for the key value store.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param importSource The import source for the key value store.
     */
    override fun importSource(importSource: IResolvable) {
      cdkBuilder.importSource(importSource.let(IResolvable::unwrap))
    }

    /**
     * @param importSource The import source for the key value store.
     */
    override fun importSource(importSource: CfnKeyValueStore.ImportSourceProperty) {
      cdkBuilder.importSource(importSource.let(CfnKeyValueStore.ImportSourceProperty::unwrap))
    }

    /**
     * @param importSource The import source for the key value store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("342ef79ef7792553404ebf0fb3fc5b3d7b128a634712be83b6ee47063f52b84e")
    override
        fun importSource(importSource: CfnKeyValueStore.ImportSourceProperty.Builder.() -> Unit):
        Unit = importSource(CfnKeyValueStore.ImportSourceProperty(importSource))

    /**
     * @param name The name of the key value store. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps,
  ) : CdkObject(cdkObject), CfnKeyValueStoreProps {
    /**
     * A comment for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-comment)
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The import source for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-importsource)
     */
    override fun importSource(): Any? = unwrap(this).getImportSource()

    /**
     * The name of the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKeyValueStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps):
        CfnKeyValueStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKeyValueStoreProps):
        software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps
  }
}
