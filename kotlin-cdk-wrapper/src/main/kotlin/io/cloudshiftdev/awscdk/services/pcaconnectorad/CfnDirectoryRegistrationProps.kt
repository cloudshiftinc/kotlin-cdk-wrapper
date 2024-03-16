@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnDirectoryRegistration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcaconnectorad.*;
 * CfnDirectoryRegistrationProps cfnDirectoryRegistrationProps =
 * CfnDirectoryRegistrationProps.builder()
 * .directoryId("directoryId")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html)
 */
public interface CfnDirectoryRegistrationProps {
  /**
   * The identifier of the Active Directory.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html#cfn-pcaconnectorad-directoryregistration-directoryid)
   */
  public fun directoryId(): String

  /**
   * Metadata assigned to a directory registration consisting of a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html#cfn-pcaconnectorad-directoryregistration-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnDirectoryRegistrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param directoryId The identifier of the Active Directory. 
     */
    public fun directoryId(directoryId: String)

    /**
     * @param tags Metadata assigned to a directory registration consisting of a key-value pair.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps.builder()

    /**
     * @param directoryId The identifier of the Active Directory. 
     */
    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    /**
     * @param tags Metadata assigned to a directory registration consisting of a key-value pair.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps,
  ) : CdkObject(cdkObject), CfnDirectoryRegistrationProps {
    /**
     * The identifier of the Active Directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html#cfn-pcaconnectorad-directoryregistration-directoryid)
     */
    override fun directoryId(): String = unwrap(this).getDirectoryId()

    /**
     * Metadata assigned to a directory registration consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html#cfn-pcaconnectorad-directoryregistration-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDirectoryRegistrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps):
        CfnDirectoryRegistrationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnDirectoryRegistrationProps

    internal fun unwrap(wrapped: CfnDirectoryRegistrationProps):
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps
  }
}
