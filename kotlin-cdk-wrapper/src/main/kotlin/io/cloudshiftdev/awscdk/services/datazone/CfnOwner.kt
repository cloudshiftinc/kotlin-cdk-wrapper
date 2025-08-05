@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

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
 * The owner that you want to add to the entity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnOwner cfnOwner = CfnOwner.Builder.create(this, "MyCfnOwner")
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
public open class CfnOwner(
  cdkObject: software.amazon.awscdk.services.datazone.CfnOwner,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOwnerProps,
  ) :
      this(software.amazon.awscdk.services.datazone.CfnOwner(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnOwnerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOwnerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnOwnerProps(props)
  )

  /**
   * The ID of the domain in which you want to add the entity owner.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The ID of the domain in which you want to add the entity owner.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   * The ID of the entity to which you want to add an owner.
   */
  public open fun entityIdentifier(): String = unwrap(this).getEntityIdentifier()

  /**
   * The ID of the entity to which you want to add an owner.
   */
  public open fun entityIdentifier(`value`: String) {
    unwrap(this).setEntityIdentifier(`value`)
  }

  /**
   * The type of an entity.
   */
  public open fun entityType(): String = unwrap(this).getEntityType()

  /**
   * The type of an entity.
   */
  public open fun entityType(`value`: String) {
    unwrap(this).setEntityType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The owner that you want to add to the entity.
   */
  public open fun owner(): Any = unwrap(this).getOwner()

  /**
   * The owner that you want to add to the entity.
   */
  public open fun owner(`value`: IResolvable) {
    unwrap(this).setOwner(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The owner that you want to add to the entity.
   */
  public open fun owner(`value`: OwnerPropertiesProperty) {
    unwrap(this).setOwner(`value`.let(OwnerPropertiesProperty.Companion::unwrap))
  }

  /**
   * The owner that you want to add to the entity.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fcf9ce7a43b224aa0dd02b8134359abf4a44dd345472ecc6a8615cedac49c44")
  public open fun owner(`value`: OwnerPropertiesProperty.Builder.() -> Unit): Unit =
      owner(OwnerPropertiesProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnOwner].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the domain in which you want to add the entity owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-domainidentifier)
     * @param domainIdentifier The ID of the domain in which you want to add the entity owner. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The ID of the entity to which you want to add an owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-entityidentifier)
     * @param entityIdentifier The ID of the entity to which you want to add an owner. 
     */
    public fun entityIdentifier(entityIdentifier: String)

    /**
     * The type of an entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-entitytype)
     * @param entityType The type of an entity. 
     */
    public fun entityType(entityType: String)

    /**
     * The owner that you want to add to the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-owner)
     * @param owner The owner that you want to add to the entity. 
     */
    public fun owner(owner: IResolvable)

    /**
     * The owner that you want to add to the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-owner)
     * @param owner The owner that you want to add to the entity. 
     */
    public fun owner(owner: OwnerPropertiesProperty)

    /**
     * The owner that you want to add to the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-owner)
     * @param owner The owner that you want to add to the entity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d299e4244874d7604b2495fc861ac9b7655e46e3352f5dac3f9483a86d872e17")
    public fun owner(owner: OwnerPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnOwner.Builder =
        software.amazon.awscdk.services.datazone.CfnOwner.Builder.create(scope, id)

    /**
     * The ID of the domain in which you want to add the entity owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-domainidentifier)
     * @param domainIdentifier The ID of the domain in which you want to add the entity owner. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The ID of the entity to which you want to add an owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-entityidentifier)
     * @param entityIdentifier The ID of the entity to which you want to add an owner. 
     */
    override fun entityIdentifier(entityIdentifier: String) {
      cdkBuilder.entityIdentifier(entityIdentifier)
    }

    /**
     * The type of an entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-entitytype)
     * @param entityType The type of an entity. 
     */
    override fun entityType(entityType: String) {
      cdkBuilder.entityType(entityType)
    }

    /**
     * The owner that you want to add to the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-owner)
     * @param owner The owner that you want to add to the entity. 
     */
    override fun owner(owner: IResolvable) {
      cdkBuilder.owner(owner.let(IResolvable.Companion::unwrap))
    }

    /**
     * The owner that you want to add to the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-owner)
     * @param owner The owner that you want to add to the entity. 
     */
    override fun owner(owner: OwnerPropertiesProperty) {
      cdkBuilder.owner(owner.let(OwnerPropertiesProperty.Companion::unwrap))
    }

    /**
     * The owner that you want to add to the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-owner.html#cfn-datazone-owner-owner)
     * @param owner The owner that you want to add to the entity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d299e4244874d7604b2495fc861ac9b7655e46e3352f5dac3f9483a86d872e17")
    override fun owner(owner: OwnerPropertiesProperty.Builder.() -> Unit): Unit =
        owner(OwnerPropertiesProperty(owner))

    public fun build(): software.amazon.awscdk.services.datazone.CfnOwner = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnOwner.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOwner {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOwner(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnOwner): CfnOwner =
        CfnOwner(cdkObject)

    internal fun unwrap(wrapped: CfnOwner): software.amazon.awscdk.services.datazone.CfnOwner =
        wrapped.cdkObject as software.amazon.awscdk.services.datazone.CfnOwner
  }

  /**
   * The properties of the domain unit owners group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * OwnerGroupPropertiesProperty ownerGroupPropertiesProperty =
   * OwnerGroupPropertiesProperty.builder()
   * .groupIdentifier("groupIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-owner-ownergroupproperties.html)
   */
  public interface OwnerGroupPropertiesProperty {
    /**
     * The ID of the domain unit owners group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-owner-ownergroupproperties.html#cfn-datazone-owner-ownergroupproperties-groupidentifier)
     */
    public fun groupIdentifier(): String? = unwrap(this).getGroupIdentifier()

    /**
     * A builder for [OwnerGroupPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupIdentifier The ID of the domain unit owners group.
       */
      public fun groupIdentifier(groupIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerGroupPropertiesProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerGroupPropertiesProperty.builder()

      /**
       * @param groupIdentifier The ID of the domain unit owners group.
       */
      override fun groupIdentifier(groupIdentifier: String) {
        cdkBuilder.groupIdentifier(groupIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerGroupPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnOwner.OwnerGroupPropertiesProperty,
    ) : CdkObject(cdkObject),
        OwnerGroupPropertiesProperty {
      /**
       * The ID of the domain unit owners group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-owner-ownergroupproperties.html#cfn-datazone-owner-ownergroupproperties-groupidentifier)
       */
      override fun groupIdentifier(): String? = unwrap(this).getGroupIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OwnerGroupPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnOwner.OwnerGroupPropertiesProperty):
          OwnerGroupPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OwnerGroupPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OwnerGroupPropertiesProperty):
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerGroupPropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerGroupPropertiesProperty
    }
  }

  /**
   * The properties of a domain unit's owner.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * OwnerPropertiesProperty ownerPropertiesProperty = OwnerPropertiesProperty.builder()
   * .group(OwnerGroupPropertiesProperty.builder()
   * .groupIdentifier("groupIdentifier")
   * .build())
   * .user(OwnerUserPropertiesProperty.builder()
   * .userIdentifier("userIdentifier")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-owner-ownerproperties.html)
   */
  public interface OwnerPropertiesProperty {
    /**
     * Specifies that the domain unit owner is a group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-owner-ownerproperties.html#cfn-datazone-owner-ownerproperties-group)
     */
    public fun group(): Any? = unwrap(this).getGroup()

    /**
     * Specifies that the domain unit owner is a user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-owner-ownerproperties.html#cfn-datazone-owner-ownerproperties-user)
     */
    public fun user(): Any? = unwrap(this).getUser()

    /**
     * A builder for [OwnerPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param group Specifies that the domain unit owner is a group.
       */
      public fun group(group: IResolvable)

      /**
       * @param group Specifies that the domain unit owner is a group.
       */
      public fun group(group: OwnerGroupPropertiesProperty)

      /**
       * @param group Specifies that the domain unit owner is a group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("168831ef3016516faa99f97fe78444070270748b4bb4b0189fc5f1f948280f2d")
      public fun group(group: OwnerGroupPropertiesProperty.Builder.() -> Unit)

      /**
       * @param user Specifies that the domain unit owner is a user.
       */
      public fun user(user: IResolvable)

      /**
       * @param user Specifies that the domain unit owner is a user.
       */
      public fun user(user: OwnerUserPropertiesProperty)

      /**
       * @param user Specifies that the domain unit owner is a user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("050880424ea2c129e7779f4b675a89fb11f40ad496330aab4f4727b8b7ffcdce")
      public fun user(user: OwnerUserPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerPropertiesProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerPropertiesProperty.builder()

      /**
       * @param group Specifies that the domain unit owner is a group.
       */
      override fun group(group: IResolvable) {
        cdkBuilder.group(group.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param group Specifies that the domain unit owner is a group.
       */
      override fun group(group: OwnerGroupPropertiesProperty) {
        cdkBuilder.group(group.let(OwnerGroupPropertiesProperty.Companion::unwrap))
      }

      /**
       * @param group Specifies that the domain unit owner is a group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("168831ef3016516faa99f97fe78444070270748b4bb4b0189fc5f1f948280f2d")
      override fun group(group: OwnerGroupPropertiesProperty.Builder.() -> Unit): Unit =
          group(OwnerGroupPropertiesProperty(group))

      /**
       * @param user Specifies that the domain unit owner is a user.
       */
      override fun user(user: IResolvable) {
        cdkBuilder.user(user.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param user Specifies that the domain unit owner is a user.
       */
      override fun user(user: OwnerUserPropertiesProperty) {
        cdkBuilder.user(user.let(OwnerUserPropertiesProperty.Companion::unwrap))
      }

      /**
       * @param user Specifies that the domain unit owner is a user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("050880424ea2c129e7779f4b675a89fb11f40ad496330aab4f4727b8b7ffcdce")
      override fun user(user: OwnerUserPropertiesProperty.Builder.() -> Unit): Unit =
          user(OwnerUserPropertiesProperty(user))

      public fun build(): software.amazon.awscdk.services.datazone.CfnOwner.OwnerPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnOwner.OwnerPropertiesProperty,
    ) : CdkObject(cdkObject),
        OwnerPropertiesProperty {
      /**
       * Specifies that the domain unit owner is a group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-owner-ownerproperties.html#cfn-datazone-owner-ownerproperties-group)
       */
      override fun group(): Any? = unwrap(this).getGroup()

      /**
       * Specifies that the domain unit owner is a user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-owner-ownerproperties.html#cfn-datazone-owner-ownerproperties-user)
       */
      override fun user(): Any? = unwrap(this).getUser()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OwnerPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnOwner.OwnerPropertiesProperty):
          OwnerPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as? OwnerPropertiesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OwnerPropertiesProperty):
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerPropertiesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerPropertiesProperty
    }
  }

  /**
   * The properties of the owner user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * OwnerUserPropertiesProperty ownerUserPropertiesProperty = OwnerUserPropertiesProperty.builder()
   * .userIdentifier("userIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-owner-owneruserproperties.html)
   */
  public interface OwnerUserPropertiesProperty {
    /**
     * The ID of the owner user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-owner-owneruserproperties.html#cfn-datazone-owner-owneruserproperties-useridentifier)
     */
    public fun userIdentifier(): String? = unwrap(this).getUserIdentifier()

    /**
     * A builder for [OwnerUserPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param userIdentifier The ID of the owner user.
       */
      public fun userIdentifier(userIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerUserPropertiesProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerUserPropertiesProperty.builder()

      /**
       * @param userIdentifier The ID of the owner user.
       */
      override fun userIdentifier(userIdentifier: String) {
        cdkBuilder.userIdentifier(userIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerUserPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnOwner.OwnerUserPropertiesProperty,
    ) : CdkObject(cdkObject),
        OwnerUserPropertiesProperty {
      /**
       * The ID of the owner user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-owner-owneruserproperties.html#cfn-datazone-owner-owneruserproperties-useridentifier)
       */
      override fun userIdentifier(): String? = unwrap(this).getUserIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OwnerUserPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnOwner.OwnerUserPropertiesProperty):
          OwnerUserPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OwnerUserPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OwnerUserPropertiesProperty):
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerUserPropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnOwner.OwnerUserPropertiesProperty
    }
  }
}
