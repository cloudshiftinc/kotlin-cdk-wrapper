@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnScript`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnScriptProps cfnScriptProps = CfnScriptProps.builder()
 * .storageLocation(S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html)
 */
public interface CfnScriptProps {
  /**
   * A descriptive label that is associated with a script.
   *
   * Script names do not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
   * stored.
   *
   * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"), and
   * a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3 bucket
   * must be in the same Region where you want to create a new script. By default, Amazon GameLift
   * uploads the latest version of the zip file; if you have S3 object versioning turned on, you can
   * use the `ObjectVersion` parameter to specify an earlier version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-storagelocation)
   */
  public fun storageLocation(): Any

  /**
   * A list of labels to assign to the new script resource.
   *
   * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
   * management, access management and cost allocation. For more information, see [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
   * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated.
   * See the AWS General Reference for actual tagging limits.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The version that is associated with a build or script.
   *
   * Version strings do not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-version)
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [CfnScriptProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name A descriptive label that is associated with a script.
     * Script names do not need to be unique.
     */
    public fun name(name: String)

    /**
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     * your Realtime scripts is stored. 
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     */
    public fun storageLocation(storageLocation: IResolvable)

    /**
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     * your Realtime scripts is stored. 
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     */
    public fun storageLocation(storageLocation: CfnScript.S3LocationProperty)

    /**
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     * your Realtime scripts is stored. 
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("715c4a858d3fad5f13e3d17193800e45a54d32471d0572a79dee0cffe9affb66")
    public fun storageLocation(storageLocation: CfnScript.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param tags A list of labels to assign to the new script resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of labels to assign to the new script resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param version The version that is associated with a build or script.
     * Version strings do not need to be unique.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnScriptProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnScriptProps.builder()

    /**
     * @param name A descriptive label that is associated with a script.
     * Script names do not need to be unique.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     * your Realtime scripts is stored. 
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     */
    override fun storageLocation(storageLocation: IResolvable) {
      cdkBuilder.storageLocation(storageLocation.let(IResolvable::unwrap))
    }

    /**
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     * your Realtime scripts is stored. 
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     */
    override fun storageLocation(storageLocation: CfnScript.S3LocationProperty) {
      cdkBuilder.storageLocation(storageLocation.let(CfnScript.S3LocationProperty::unwrap))
    }

    /**
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     * your Realtime scripts is stored. 
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("715c4a858d3fad5f13e3d17193800e45a54d32471d0572a79dee0cffe9affb66")
    override fun storageLocation(storageLocation: CfnScript.S3LocationProperty.Builder.() -> Unit):
        Unit = storageLocation(CfnScript.S3LocationProperty(storageLocation))

    /**
     * @param tags A list of labels to assign to the new script resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of labels to assign to the new script resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param version The version that is associated with a build or script.
     * Version strings do not need to be unique.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnScriptProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.gamelift.CfnScriptProps,
  ) : CdkObject(cdkObject), CfnScriptProps {
    /**
     * A descriptive label that is associated with a script.
     *
     * Script names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
     * stored.
     *
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-storagelocation)
     */
    override fun storageLocation(): Any = unwrap(this).getStorageLocation()

    /**
     * A list of labels to assign to the new script resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The version that is associated with a build or script.
     *
     * Version strings do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-version)
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScriptProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnScriptProps):
        CfnScriptProps = CdkObjectWrappers.wrap(cdkObject) as? CfnScriptProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScriptProps):
        software.amazon.awscdk.services.gamelift.CfnScriptProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.gamelift.CfnScriptProps
  }
}
