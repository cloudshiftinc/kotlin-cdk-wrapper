@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * CloudFormation template options for a stack.
 */
public interface ITemplateOptions {
  /**
   * Gets or sets the description of this stack.
   *
   * If provided, it will be included in the CloudFormation template's "Description" attribute.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Gets or sets the description of this stack.
   *
   * If provided, it will be included in the CloudFormation template's "Description" attribute.
   */
  public fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Metadata associated with the CloudFormation template.
   */
  public fun metadata(): Map<String, Any> = unwrap(this).getMetadata() ?: emptyMap()

  /**
   * Metadata associated with the CloudFormation template.
   */
  public fun metadata(`value`: Map<String, Any>) {
    unwrap(this).setMetadata(`value`)
  }

  /**
   * Gets or sets the AWSTemplateFormatVersion field of the CloudFormation template.
   */
  public fun templateFormatVersion(): String? = unwrap(this).getTemplateFormatVersion()

  /**
   * Gets or sets the AWSTemplateFormatVersion field of the CloudFormation template.
   */
  public fun templateFormatVersion(`value`: String) {
    unwrap(this).setTemplateFormatVersion(`value`)
  }

  /**
   * Gets or sets the top-level template transform(s) for this stack (e.g.
   * `["AWS::Serverless-2016-10-31"]`).
   */
  public fun transforms(): List<String> = unwrap(this).getTransforms() ?: emptyList()

  /**
   * Gets or sets the top-level template transform(s) for this stack (e.g.
   * `["AWS::Serverless-2016-10-31"]`).
   */
  public fun transforms(`value`: List<String>) {
    unwrap(this).setTransforms(`value`)
  }

  /**
   * Gets or sets the top-level template transform(s) for this stack (e.g.
   * `["AWS::Serverless-2016-10-31"]`).
   */
  public fun transforms(vararg `value`: String): Unit = transforms(`value`.toList())

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ITemplateOptions,
  ) : CdkObject(cdkObject), ITemplateOptions {
    /**
     * Gets or sets the description of this stack.
     *
     * If provided, it will be included in the CloudFormation template's "Description" attribute.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Gets or sets the description of this stack.
     *
     * If provided, it will be included in the CloudFormation template's "Description" attribute.
     */
    override fun description(`value`: String) {
      unwrap(this).setDescription(`value`)
    }

    /**
     * Metadata associated with the CloudFormation template.
     */
    override fun metadata(): Map<String, Any> = unwrap(this).getMetadata() ?: emptyMap()

    /**
     * Metadata associated with the CloudFormation template.
     */
    override fun metadata(`value`: Map<String, Any>) {
      unwrap(this).setMetadata(`value`)
    }

    /**
     * Gets or sets the AWSTemplateFormatVersion field of the CloudFormation template.
     */
    override fun templateFormatVersion(): String? = unwrap(this).getTemplateFormatVersion()

    /**
     * Gets or sets the AWSTemplateFormatVersion field of the CloudFormation template.
     */
    override fun templateFormatVersion(`value`: String) {
      unwrap(this).setTemplateFormatVersion(`value`)
    }

    /**
     * Gets or sets the top-level template transform(s) for this stack (e.g.
     * `["AWS::Serverless-2016-10-31"]`).
     */
    override fun transforms(): List<String> = unwrap(this).getTransforms() ?: emptyList()

    /**
     * Gets or sets the top-level template transform(s) for this stack (e.g.
     * `["AWS::Serverless-2016-10-31"]`).
     */
    override fun transforms(`value`: List<String>) {
      unwrap(this).setTransforms(`value`)
    }

    /**
     * Gets or sets the top-level template transform(s) for this stack (e.g.
     * `["AWS::Serverless-2016-10-31"]`).
     */
    override fun transforms(vararg `value`: String): Unit = transforms(`value`.toList())
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ITemplateOptions): ITemplateOptions =
        CdkObjectWrappers.wrap(cdkObject) as? ITemplateOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITemplateOptions): software.amazon.awscdk.ITemplateOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.ITemplateOptions
  }
}
