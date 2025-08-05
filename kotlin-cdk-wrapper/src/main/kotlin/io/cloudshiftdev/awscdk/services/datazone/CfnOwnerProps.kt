@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnOwner`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnOwnerProps cfnOwnerProps = CfnOwnerProps.builder()
 * .domainIdentifier("domainIdentifier")
 * .entityIdentifier("entityIdentifier")
 * .entityType("entityType")
 * .owner(OwnerPropertiesProperty.builder()
 * .group(OwnerGroupPropertiesProperty.builder()
 * .groupIdentifier("groupIdentifier")
 * .build())
 * .user(OwnerUserPropertiesProperty.builder()
 * .userIdentifier("userIdentifier")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html)
 */
public interface CfnOwnerProps {
  /**
   * The ID of the domain in which you want to add the entity owner.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * The ID of the entity to which you want to add an owner.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-entityidentifier)
   */
  public fun entityIdentifier(): String

  /**
   * The type of an entity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-entitytype)
   */
  public fun entityType(): String

  /**
   * The owner that you want to add to the entity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-owner)
   */
  public fun owner(): Any

  /**
   * A builder for [CfnOwnerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainIdentifier The ID of the domain in which you want to add the entity owner. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param entityIdentifier The ID of the entity to which you want to add an owner. 
     */
    public fun entityIdentifier(entityIdentifier: String)

    /**
     * @param entityType The type of an entity. 
     */
    public fun entityType(entityType: String)

    /**
     * @param owner The owner that you want to add to the entity. 
     */
    public fun owner(owner: IResolvable)

    /**
     * @param owner The owner that you want to add to the entity. 
     */
    public fun owner(owner: CfnOwner.OwnerPropertiesProperty)

    /**
     * @param owner The owner that you want to add to the entity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d40893b47967cedcc32cbbd2e21547a0428fba191b7c697c7c43cb9646d5198")
    public fun owner(owner: CfnOwner.OwnerPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnOwnerProps.Builder =
        software.amazon.awscdk.services.datazone.CfnOwnerProps.builder()

    /**
     * @param domainIdentifier The ID of the domain in which you want to add the entity owner. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param entityIdentifier The ID of the entity to which you want to add an owner. 
     */
    override fun entityIdentifier(entityIdentifier: String) {
      cdkBuilder.entityIdentifier(entityIdentifier)
    }

    /**
     * @param entityType The type of an entity. 
     */
    override fun entityType(entityType: String) {
      cdkBuilder.entityType(entityType)
    }

    /**
     * @param owner The owner that you want to add to the entity. 
     */
    override fun owner(owner: IResolvable) {
      cdkBuilder.owner(owner.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param owner The owner that you want to add to the entity. 
     */
    override fun owner(owner: CfnOwner.OwnerPropertiesProperty) {
      cdkBuilder.owner(owner.let(CfnOwner.OwnerPropertiesProperty.Companion::unwrap))
    }

    /**
     * @param owner The owner that you want to add to the entity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d40893b47967cedcc32cbbd2e21547a0428fba191b7c697c7c43cb9646d5198")
    override fun owner(owner: CfnOwner.OwnerPropertiesProperty.Builder.() -> Unit): Unit =
        owner(CfnOwner.OwnerPropertiesProperty(owner))

    public fun build(): software.amazon.awscdk.services.datazone.CfnOwnerProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datazone.CfnOwnerProps,
  ) : CdkObject(cdkObject),
      CfnOwnerProps {
    /**
     * The ID of the domain in which you want to add the entity owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * The ID of the entity to which you want to add an owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-entityidentifier)
     */
    override fun entityIdentifier(): String = unwrap(this).getEntityIdentifier()

    /**
     * The type of an entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-entitytype)
     */
    override fun entityType(): String = unwrap(this).getEntityType()

    /**
     * The owner that you want to add to the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-owner)
     */
    override fun owner(): Any = unwrap(this).getOwner()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOwnerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnOwnerProps):
        CfnOwnerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnOwnerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOwnerProps):
        software.amazon.awscdk.services.datazone.CfnOwnerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.datazone.CfnOwnerProps
  }
}
