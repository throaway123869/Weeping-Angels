package me.swirtzly.minecraft.angels.client.models.tile;

import com.mojang.blaze3d.matrix.MatrixStack;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import me.swirtzly.minecraft.angels.WeepingAngels;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelCG extends EntityModel<Entity> {
	
	private ResourceLocation TEXTURE = new ResourceLocation(WeepingAngels.MODID, "textures/entities/cg_tex.png");
	
	private ModelRenderer MAIN;
	private ModelRenderer cG11;
	private ModelRenderer cG11_1;
	private ModelRenderer cG11_2;
	private ModelRenderer cG23;
	private ModelRenderer cG23_1;
	private ModelRenderer cG23_2;
	private ModelRenderer cG23_3;
	private ModelRenderer cG23_4;
	private ModelRenderer cG23_5;
	private ModelRenderer cG23_6;
	private ModelRenderer cG23_7;
	private ModelRenderer cG23_8;
	private ModelRenderer cG23_9;
	private ModelRenderer cG23_10;
	private ModelRenderer cG23_11;
	private ModelRenderer cG85;
	private ModelRenderer cG85_1;
	private ModelRenderer cG85_2;
	private ModelRenderer cG82;
	private ModelRenderer cG82_1;
	private ModelRenderer cG82_2;
	private ModelRenderer cG82_3;
	private ModelRenderer cG82_4;
	private ModelRenderer cG82_5;
	private ModelRenderer cG1;
	private ModelRenderer cG1_1;
	private ModelRenderer cG3;
	private ModelRenderer cG3_1;
	private ModelRenderer cG3_2;
	private ModelRenderer cG3_3;
	private ModelRenderer cG3_4;
	private ModelRenderer cG3_5;
	private ModelRenderer cG3_6;
	private ModelRenderer cG3_7;
	private ModelRenderer cG1_2;
	private ModelRenderer cG1_3;
	private ModelRenderer cG3_8;
	private ModelRenderer cG3_9;
	private ModelRenderer cG3_10;
	private ModelRenderer cG3_11;
	private ModelRenderer cG3_12;
	private ModelRenderer cG3_13;
	private ModelRenderer cG3_14;
	private ModelRenderer cG3_15;
	private ModelRenderer cG1_4;
	private ModelRenderer cG1_5;
	private ModelRenderer cG3_16;
	private ModelRenderer cG3_17;
	private ModelRenderer cG3_18;
	private ModelRenderer cG3_19;
	private ModelRenderer cG3_20;
	private ModelRenderer cG3_21;
	private ModelRenderer cG3_22;
	private ModelRenderer cG3_23;
	private ModelRenderer cG25;
	private ModelRenderer cG88;
	private ModelRenderer cG26;
	private ModelRenderer cG89;
	private ModelRenderer cG25_1;
	private ModelRenderer cG88_1;
	private ModelRenderer cG26_1;
	private ModelRenderer cG89_1;
	private ModelRenderer cG25_2;
	private ModelRenderer cG88_2;
	private ModelRenderer cG26_2;
	private ModelRenderer cG89_2;
	private ModelRenderer cG25_3;
	private ModelRenderer cG88_3;
	private ModelRenderer cG26_3;
	private ModelRenderer cG89_3;
	private ModelRenderer cG25_4;
	private ModelRenderer cG88_4;
	private ModelRenderer cG26_4;
	private ModelRenderer cG89_4;
	private ModelRenderer cG25_5;
	private ModelRenderer cG88_5;
	private ModelRenderer cG26_5;
	private ModelRenderer cG89_5;
	private ModelRenderer cG25_6;
	private ModelRenderer cG88_6;
	private ModelRenderer cG26_6;
	private ModelRenderer cG89_6;
	private ModelRenderer cG25_7;
	private ModelRenderer cG88_7;
	private ModelRenderer cG26_7;
	private ModelRenderer cG89_7;
	private ModelRenderer cG25_8;
	private ModelRenderer cG88_8;
	private ModelRenderer cG26_8;
	private ModelRenderer cG89_8;
	private ModelRenderer cG25_9;
	private ModelRenderer cG88_9;
	private ModelRenderer cG26_9;
	private ModelRenderer cG89_9;
	private ModelRenderer cG25_10;
	private ModelRenderer cG88_10;
	private ModelRenderer cG26_10;
	private ModelRenderer cG89_10;
	private ModelRenderer cG25_11;
	private ModelRenderer cG88_11;
	private ModelRenderer cG26_11;
	private ModelRenderer cG89_11;
	
	public ModelCG() {
		textureWidth = 64;
		textureHeight = 32;
		cG89_5 = new ModelRenderer(this, 59, 12);
		cG89_5.setRotationPoint(0.0F, -0.15F, 0.05F);
		cG89_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(cG89_5, 0.0F, 0.0F, 0.7853981633974483F);
		cG82_4 = new ModelRenderer(this, 0, 0);
		cG82_4.setRotationPoint(0.0F, 23.9F, 0.0F);
		cG82_4.addBox(-0.5F, -2.8F, -0.86F, 1, 1, 1, 0.0F);
		setRotateAngle(cG82_4, 0.0F, 3.141592653589793F, 0.0F);
		cG88_8 = new ModelRenderer(this, 0, 0);
		cG88_8.setRotationPoint(1.0F, -2.0F, -3.73F);
		cG88_8.addBox(0.0F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG88_8, 1.0471975511965976F, -0.2617993877991494F, 0.0F);
		cG23_9 = new ModelRenderer(this, 57, 2);
		cG23_9.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG23_9.addBox(-1.0F, -2.0F, -3.73F, 2, 2, 1, 0.0F);
		setRotateAngle(cG23_9, 0.0F, 0.5235987755982988F, 0.0F);
		cG26_11 = new ModelRenderer(this, 0, 21);
		cG26_11.setRotationPoint(0.0F, 0.0F, 1.0F);
		cG26_11.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(cG26_11, -1.0471975511965976F, 0.0F, 0.0F);
		cG3_17 = new ModelRenderer(this, 29, 8);
		cG3_17.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_17.addBox(-0.7F, -2.0F, -3.0F, 1, 2, 1, 0.0F);
		cG1_4 = new ModelRenderer(this, 50, 6);
		cG1_4.setRotationPoint(0.0F, 24.0F, -3.3F);
		cG1_4.addBox(-0.5F, -3.0F, -2.0F, 1, 3, 2, 0.0F);
		cG26_2 = new ModelRenderer(this, 26, 11);
		cG26_2.setRotationPoint(0.0F, 0.0F, 1.0F);
		cG26_2.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(cG26_2, -1.0471975511965976F, 0.0F, 0.0F);
		cG3 = new ModelRenderer(this, 40, 3);
		cG3.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3.addBox(-0.3F, -2.0F, -3.0F, 1, 2, 1, 0.0F);
		cG11 = new ModelRenderer(this, 0, 0);
		cG11.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG11.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG11, 0.0F, 2.0943951023931953F, 0.0F);
		cG26_1 = new ModelRenderer(this, 0, 11);
		cG26_1.setRotationPoint(0.0F, 0.0F, 1.0F);
		cG26_1.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(cG26_1, -1.0471975511965976F, 0.0F, 0.0F);
		cG88_7 = new ModelRenderer(this, 0, 0);
		cG88_7.setRotationPoint(1.0F, -2.0F, -3.73F);
		cG88_7.addBox(0.0F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG88_7, 1.0471975511965976F, -0.2617993877991494F, 0.0F);
		cG88_10 = new ModelRenderer(this, 0, 0);
		cG88_10.setRotationPoint(1.0F, -2.0F, -3.73F);
		cG88_10.addBox(0.0F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG88_10, 1.0471975511965976F, -0.2617993877991494F, 0.0F);
		cG85_2 = new ModelRenderer(this, 24, 3);
		cG85_2.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG85_2.addBox(-0.5F, -2.9F, 0.9F, 1, 1, 2, 0.0F);
		setRotateAngle(cG85_2, 0.0F, -2.0943951023931953F, 0.0F);
		cG3_22 = new ModelRenderer(this, 8, 9);
		cG3_22.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_22.addBox(-0.4F, -3.3F, -2.0F, 1, 1, 2, 0.0F);
		cG89_3 = new ModelRenderer(this, 8, 12);
		cG89_3.setRotationPoint(0.0F, -0.15F, 0.05F);
		cG89_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(cG89_3, 0.0F, 0.0F, 0.7853981633974483F);
		cG82_2 = new ModelRenderer(this, 0, 0);
		cG82_2.setRotationPoint(0.0F, 23.9F, 0.0F);
		cG82_2.addBox(-0.5F, -2.8F, -0.86F, 1, 1, 1, 0.0F);
		setRotateAngle(cG82_2, 0.0F, 1.0471975511965976F, 0.0F);
		cG3_12 = new ModelRenderer(this, 22, 6);
		cG3_12.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_12.addBox(-0.5F, -3.1F, -3.2F, 1, 1, 1, 0.0F);
		cG85 = new ModelRenderer(this, 12, 3);
		cG85.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG85.addBox(-0.5F, -2.9F, 0.9F, 1, 1, 2, 0.0F);
		cG1_2 = new ModelRenderer(this, 0, 6);
		cG1_2.setRotationPoint(0.0F, 24.0F, -3.3F);
		cG1_2.addBox(-0.5F, -3.0F, -2.0F, 1, 3, 2, 0.0F);
		cG25_1 = new ModelRenderer(this, 55, 10);
		cG25_1.setRotationPoint(0.0F, -2.0F, -3.73F);
		cG25_1.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(cG25_1, 1.0471975511965976F, 0.0F, 0.0F);
		cG1_1 = new ModelRenderer(this, 36, 3);
		cG1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG1_1.addBox(-0.5F, -3.0F, -3.0F, 1, 3, 1, 0.0F);
		cG25_6 = new ModelRenderer(this, 12, 14);
		cG25_6.setRotationPoint(0.0F, -2.0F, -3.73F);
		cG25_6.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(cG25_6, 1.0471975511965976F, 0.0F, 0.0F);
		cG26 = new ModelRenderer(this, 39, 9);
		cG26.setRotationPoint(0.0F, 0.0F, 1.0F);
		cG26.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(cG26, -1.0471975511965976F, 0.0F, 0.0F);
		cG26_10 = new ModelRenderer(this, 30, 19);
		cG26_10.setRotationPoint(0.0F, 0.0F, 1.0F);
		cG26_10.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(cG26_10, -1.0471975511965976F, 0.0F, 0.0F);
		cG23_5 = new ModelRenderer(this, 34, 0);
		cG23_5.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG23_5.addBox(-1.0F, -2.0F, -3.73F, 2, 2, 1, 0.0F);
		setRotateAngle(cG23_5, 0.0F, 1.5707963267948966F, 0.0F);
		cG3_19 = new ModelRenderer(this, 42, 6);
		cG3_19.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_19.addBox(-0.3F, -3.1F, -3.0F, 1, 1, 1, 0.0F);
		cG3_3 = new ModelRenderer(this, 58, 0);
		cG3_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_3.addBox(-0.3F, -3.1F, -3.0F, 1, 1, 1, 0.0F);
		cG25_8 = new ModelRenderer(this, 8, 16);
		cG25_8.setRotationPoint(0.0F, -2.0F, -3.73F);
		cG25_8.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(cG25_8, 1.0471975511965976F, 0.0F, 0.0F);
		cG26_9 = new ModelRenderer(this, 10, 17);
		cG26_9.setRotationPoint(0.0F, 0.0F, 1.0F);
		cG26_9.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(cG26_9, -1.0471975511965976F, 0.0F, 0.0F);
		cG88_3 = new ModelRenderer(this, 0, 0);
		cG88_3.setRotationPoint(1.0F, -2.0F, -3.73F);
		cG88_3.addBox(0.0F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG88_3, 1.0471975511965976F, -0.2617993877991494F, 0.0F);
		cG26_6 = new ModelRenderer(this, 0, 16);
		cG26_6.setRotationPoint(0.0F, 0.0F, 1.0F);
		cG26_6.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(cG26_6, -1.0471975511965976F, 0.0F, 0.0F);
		cG3_6 = new ModelRenderer(this, 52, 3);
		cG3_6.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_6.addBox(-0.4F, -3.3F, -2.0F, 1, 1, 2, 0.0F);
		cG3_18 = new ModelRenderer(this, 33, 8);
		cG3_18.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_18.addBox(-0.5F, -2.0F, -3.2F, 1, 2, 1, 0.0F);
		cG25_2 = new ModelRenderer(this, 24, 11);
		cG25_2.setRotationPoint(0.0F, -2.0F, -3.73F);
		cG25_2.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(cG25_2, 1.0471975511965976F, 0.0F, 0.0F);
		cG23_7 = new ModelRenderer(this, 46, 0);
		cG23_7.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG23_7.addBox(-1.0F, -2.0F, -3.73F, 2, 2, 1, 0.0F);
		setRotateAngle(cG23_7, 0.0F, 1.0471975511965976F, 0.0F);
		cG88_2 = new ModelRenderer(this, 0, 0);
		cG88_2.setRotationPoint(1.0F, -2.0F, -3.73F);
		cG88_2.addBox(0.0F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG88_2, 1.0471975511965976F, -0.2617993877991494F, 0.0F);
		cG89_7 = new ModelRenderer(this, 34, 13);
		cG89_7.setRotationPoint(0.0F, -0.15F, 0.05F);
		cG89_7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(cG89_7, 0.0F, 0.0F, 0.7853981633974483F);
		cG88_11 = new ModelRenderer(this, 0, 0);
		cG88_11.setRotationPoint(1.0F, -2.0F, -3.73F);
		cG88_11.addBox(0.0F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG88_11, 1.0471975511965976F, -0.2617993877991494F, 0.0F);
		cG89_1 = new ModelRenderer(this, 47, 10);
		cG89_1.setRotationPoint(0.0F, -0.15F, 0.05F);
		cG89_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(cG89_1, 0.0F, 0.0F, 0.7853981633974483F);
		cG25 = new ModelRenderer(this, 37, 9);
		cG25.setRotationPoint(0.0F, -2.0F, -3.73F);
		cG25.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(cG25, 1.0471975511965976F, 0.0F, 0.0F);
		cG89_11 = new ModelRenderer(this, 0, 18);
		cG89_11.setRotationPoint(0.0F, -0.15F, 0.05F);
		cG89_11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(cG89_11, 0.0F, 0.0F, 0.7853981633974483F);
		cG85_1 = new ModelRenderer(this, 18, 3);
		cG85_1.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG85_1.addBox(-0.5F, -2.9F, 0.9F, 1, 1, 2, 0.0F);
		setRotateAngle(cG85_1, 0.0F, 2.0943951023931953F, 0.0F);
		cG82_1 = new ModelRenderer(this, 0, 0);
		cG82_1.setRotationPoint(0.0F, 23.9F, 0.0F);
		cG82_1.addBox(-0.5F, -2.8F, -0.86F, 1, 1, 1, 0.0F);
		cG3_2 = new ModelRenderer(this, 48, 3);
		cG3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_2.addBox(-0.5F, -2.0F, -3.2F, 1, 2, 1, 0.0F);
		MAIN = new ModelRenderer(this, 0, 0);
		MAIN.setRotationPoint(0.0F, 12.0F, 0.0F);
		MAIN.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		cG23_6 = new ModelRenderer(this, 40, 0);
		cG23_6.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG23_6.addBox(-1.0F, -2.0F, -3.73F, 2, 2, 1, 0.0F);
		setRotateAngle(cG23_6, 0.0F, -1.0471975511965976F, 0.0F);
		cG82_5 = new ModelRenderer(this, 0, 0);
		cG82_5.setRotationPoint(0.0F, 23.9F, 0.0F);
		cG82_5.addBox(-0.5F, -2.8F, -0.86F, 1, 1, 1, 0.0F);
		setRotateAngle(cG82_5, 0.0F, 2.0943951023931953F, 0.0F);
		cG89_2 = new ModelRenderer(this, 0, 11);
		cG89_2.setRotationPoint(0.0F, -0.15F, 0.05F);
		cG89_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(cG89_2, 0.0F, 0.0F, 0.7853981633974483F);
		cG25_7 = new ModelRenderer(this, 42, 15);
		cG25_7.setRotationPoint(0.0F, -2.0F, -3.73F);
		cG25_7.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(cG25_7, 1.0471975511965976F, 0.0F, 0.0F);
		cG26_5 = new ModelRenderer(this, 34, 14);
		cG26_5.setRotationPoint(0.0F, 0.0F, 1.0F);
		cG26_5.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(cG26_5, -1.0471975511965976F, 0.0F, 0.0F);
		cG89_10 = new ModelRenderer(this, 58, 16);
		cG89_10.setRotationPoint(0.0F, -0.15F, 0.05F);
		cG89_10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(cG89_10, 0.0F, 0.0F, 0.7853981633974483F);
		cG26_7 = new ModelRenderer(this, 22, 16);
		cG26_7.setRotationPoint(0.0F, 0.0F, 1.0F);
		cG26_7.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(cG26_7, -1.0471975511965976F, 0.0F, 0.0F);
		cG89_8 = new ModelRenderer(this, 59, 14);
		cG89_8.setRotationPoint(0.0F, -0.15F, 0.05F);
		cG89_8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(cG89_8, 0.0F, 0.0F, 0.7853981633974483F);
		cG23_1 = new ModelRenderer(this, 10, 0);
		cG23_1.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG23_1.addBox(-1.0F, -2.0F, -3.73F, 2, 2, 1, 0.0F);
		setRotateAngle(cG23_1, 0.0F, 2.6179938779914944F, 0.0F);
		cG3_15 = new ModelRenderer(this, 44, 6);
		cG3_15.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_15.addBox(-0.6F, -3.3F, -2.0F, 1, 1, 2, 0.0F);
		cG89_9 = new ModelRenderer(this, 0, 16);
		cG89_9.setRotationPoint(0.0F, -0.15F, 0.05F);
		cG89_9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(cG89_9, 0.0F, 0.0F, 0.7853981633974483F);
		cG88_9 = new ModelRenderer(this, 0, 0);
		cG88_9.setRotationPoint(1.0F, -2.0F, -3.73F);
		cG88_9.addBox(0.0F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG88_9, 1.0471975511965976F, -0.2617993877991494F, 0.0F);
		cG25_10 = new ModelRenderer(this, 52, 16);
		cG25_10.setRotationPoint(0.0F, -2.0F, -3.73F);
		cG25_10.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(cG25_10, 1.0471975511965976F, 0.0F, 0.0F);
		cG25_3 = new ModelRenderer(this, 34, 11);
		cG25_3.setRotationPoint(0.0F, -2.0F, -3.73F);
		cG25_3.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(cG25_3, 1.0471975511965976F, 0.0F, 0.0F);
		cG26_3 = new ModelRenderer(this, 47, 11);
		cG26_3.setRotationPoint(0.0F, 0.0F, 1.0F);
		cG26_3.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(cG26_3, -1.0471975511965976F, 0.0F, 0.0F);
		cG88_1 = new ModelRenderer(this, 0, 0);
		cG88_1.setRotationPoint(1.0F, -2.0F, -3.73F);
		cG88_1.addBox(0.0F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG88_1, 1.0471975511965976F, -0.2617993877991494F, 0.0F);
		cG3_4 = new ModelRenderer(this, 16, 3);
		cG3_4.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_4.addBox(-0.5F, -3.1F, -3.2F, 1, 1, 1, 0.0F);
		cG23_10 = new ModelRenderer(this, 0, 3);
		cG23_10.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG23_10.addBox(-1.0F, -2.0F, -3.73F, 2, 2, 1, 0.0F);
		cG3_5 = new ModelRenderer(this, 22, 3);
		cG3_5.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_5.addBox(-0.7F, -3.1F, -3.0F, 1, 1, 1, 0.0F);
		cG3_9 = new ModelRenderer(this, 14, 6);
		cG3_9.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_9.addBox(-0.7F, -2.0F, -3.0F, 1, 2, 1, 0.0F);
		cG23_8 = new ModelRenderer(this, 52, 0);
		cG23_8.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG23_8.addBox(-1.0F, -2.0F, -3.73F, 2, 2, 1, 0.0F);
		setRotateAngle(cG23_8, 0.0F, -0.5235987755982988F, 0.0F);
		cG26_8 = new ModelRenderer(this, 44, 16);
		cG26_8.setRotationPoint(0.0F, 0.0F, 1.0F);
		cG26_8.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(cG26_8, -1.0471975511965976F, 0.0F, 0.0F);
		cG1_5 = new ModelRenderer(this, 21, 8);
		cG1_5.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG1_5.addBox(-0.5F, -3.0F, -3.0F, 1, 3, 1, 0.0F);
		cG3_21 = new ModelRenderer(this, 56, 8);
		cG3_21.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_21.addBox(-0.7F, -3.1F, -3.0F, 1, 1, 1, 0.0F);
		cG23_11 = new ModelRenderer(this, 6, 3);
		cG23_11.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG23_11.addBox(-1.0F, -2.0F, -3.73F, 2, 2, 1, 0.0F);
		setRotateAngle(cG23_11, 0.0F, 3.141592653589793F, 0.0F);
		cG89_6 = new ModelRenderer(this, 0, 13);
		cG89_6.setRotationPoint(0.0F, -0.15F, 0.05F);
		cG89_6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(cG89_6, 0.0F, 0.0F, 0.7853981633974483F);
		cG3_8 = new ModelRenderer(this, 10, 6);
		cG3_8.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_8.addBox(-0.3F, -2.0F, -3.0F, 1, 2, 1, 0.0F);
		cG3_13 = new ModelRenderer(this, 26, 6);
		cG3_13.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_13.addBox(-0.7F, -3.1F, -3.0F, 1, 1, 1, 0.0F);
		cG23_4 = new ModelRenderer(this, 28, 0);
		cG23_4.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG23_4.addBox(-1.0F, -2.0F, -3.73F, 2, 2, 1, 0.0F);
		setRotateAngle(cG23_4, 0.0F, -1.5707963267948966F, 0.0F);
		cG82_3 = new ModelRenderer(this, 0, 0);
		cG82_3.setRotationPoint(0.0F, 23.9F, 0.0F);
		cG82_3.addBox(-0.5F, -2.8F, -0.86F, 1, 1, 1, 0.0F);
		setRotateAngle(cG82_3, 0.0F, -1.0471975511965976F, 0.0F);
		cG3_20 = new ModelRenderer(this, 48, 6);
		cG3_20.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_20.addBox(-0.5F, -3.1F, -3.2F, 1, 1, 1, 0.0F);
		cG3_16 = new ModelRenderer(this, 25, 8);
		cG3_16.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_16.addBox(-0.3F, -2.0F, -3.0F, 1, 2, 1, 0.0F);
		cG26_4 = new ModelRenderer(this, 14, 12);
		cG26_4.setRotationPoint(0.0F, 0.0F, 1.0F);
		cG26_4.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(cG26_4, -1.0471975511965976F, 0.0F, 0.0F);
		cG25_4 = new ModelRenderer(this, 12, 12);
		cG25_4.setRotationPoint(0.0F, -2.0F, -3.73F);
		cG25_4.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(cG25_4, 1.0471975511965976F, 0.0F, 0.0F);
		cG3_11 = new ModelRenderer(this, 28, 3);
		cG3_11.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_11.addBox(-0.3F, -3.1F, -3.0F, 1, 1, 1, 0.0F);
		cG88_4 = new ModelRenderer(this, 0, 0);
		cG88_4.setRotationPoint(1.0F, -2.0F, -3.73F);
		cG88_4.addBox(0.0F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG88_4, 1.0471975511965976F, -0.2617993877991494F, 0.0F);
		cG23 = new ModelRenderer(this, 4, 0);
		cG23.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG23.addBox(-1.0F, -2.0F, -3.73F, 2, 2, 1, 0.0F);
		setRotateAngle(cG23, 0.0F, -2.6179938779914944F, 0.0F);
		cG23_2 = new ModelRenderer(this, 16, 0);
		cG23_2.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG23_2.addBox(-1.0F, -2.0F, -3.73F, 2, 2, 1, 0.0F);
		setRotateAngle(cG23_2, 0.0F, -2.0943951023931953F, 0.0F);
		cG3_14 = new ModelRenderer(this, 38, 6);
		cG3_14.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_14.addBox(-0.4F, -3.3F, -2.0F, 1, 1, 2, 0.0F);
		cG88_6 = new ModelRenderer(this, 0, 0);
		cG88_6.setRotationPoint(1.0F, -2.0F, -3.73F);
		cG88_6.addBox(0.0F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG88_6, 1.0471975511965976F, -0.2617993877991494F, 0.0F);
		cG89_4 = new ModelRenderer(this, 55, 12);
		cG89_4.setRotationPoint(0.0F, -0.15F, 0.05F);
		cG89_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(cG89_4, 0.0F, 0.0F, 0.7853981633974483F);
		cG3_7 = new ModelRenderer(this, 56, 5);
		cG3_7.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_7.addBox(-0.6F, -3.3F, -2.0F, 1, 1, 2, 0.0F);
		cG88 = new ModelRenderer(this, 0, 0);
		cG88.setRotationPoint(1.0F, -2.0F, -3.73F);
		cG88.addBox(0.0F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG88, 1.0471975511965976F, -0.2617993877991494F, 0.0F);
		cG3_10 = new ModelRenderer(this, 18, 6);
		cG3_10.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_10.addBox(-0.5F, -2.0F, -3.2F, 1, 2, 1, 0.0F);
		cG89 = new ModelRenderer(this, 12, 9);
		cG89.setRotationPoint(0.0F, -0.15F, 0.05F);
		cG89.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(cG89, 0.0F, 0.0F, 0.7853981633974483F);
		cG25_11 = new ModelRenderer(this, 18, 17);
		cG25_11.setRotationPoint(0.0F, -2.0F, -3.73F);
		cG25_11.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(cG25_11, 1.0471975511965976F, 0.0F, 0.0F);
		cG3_1 = new ModelRenderer(this, 44, 3);
		cG3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_1.addBox(-0.7F, -2.0F, -3.0F, 1, 2, 1, 0.0F);
		cG11_1 = new ModelRenderer(this, 0, 0);
		cG11_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG11_1.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		cG11_2 = new ModelRenderer(this, 0, 0);
		cG11_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG11_2.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG11_2, 0.0F, -2.0943951023931953F, 0.0F);
		cG88_5 = new ModelRenderer(this, 0, 0);
		cG88_5.setRotationPoint(1.0F, -2.0F, -3.73F);
		cG88_5.addBox(0.0F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(cG88_5, 1.0471975511965976F, -0.2617993877991494F, 0.0F);
		cG82 = new ModelRenderer(this, 0, 0);
		cG82.setRotationPoint(0.0F, 23.9F, 0.0F);
		cG82.addBox(-0.5F, -2.8F, -0.86F, 1, 1, 1, 0.0F);
		setRotateAngle(cG82, 0.0F, -2.0943951023931953F, 0.0F);
		cG25_9 = new ModelRenderer(this, 30, 16);
		cG25_9.setRotationPoint(0.0F, -2.0F, -3.73F);
		cG25_9.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(cG25_9, 1.0471975511965976F, 0.0F, 0.0F);
		cG23_3 = new ModelRenderer(this, 22, 0);
		cG23_3.setRotationPoint(0.0F, 24.0F, 0.0F);
		cG23_3.addBox(-1.0F, -2.0F, -3.73F, 2, 2, 1, 0.0F);
		setRotateAngle(cG23_3, 0.0F, 2.0943951023931953F, 0.0F);
		cG25_5 = new ModelRenderer(this, 22, 13);
		cG25_5.setRotationPoint(0.0F, -2.0F, -3.73F);
		cG25_5.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(cG25_5, 1.0471975511965976F, 0.0F, 0.0F);
		cG1 = new ModelRenderer(this, 30, 3);
		cG1.setRotationPoint(0.0F, 24.0F, -3.3F);
		cG1.addBox(-0.5F, -3.0F, -2.0F, 1, 3, 2, 0.0F);
		cG3_23 = new ModelRenderer(this, 14, 9);
		cG3_23.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG3_23.addBox(-0.6F, -3.3F, -2.0F, 1, 1, 2, 0.0F);
		cG1_3 = new ModelRenderer(this, 6, 6);
		cG1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		cG1_3.addBox(-0.5F, -3.0F, -3.0F, 1, 3, 1, 0.0F);
		cG88_5.addChild(cG89_5);
		MAIN.addChild(cG82_4);
		cG23_8.addChild(cG88_8);
		MAIN.addChild(cG23_9);
		cG25_11.addChild(cG26_11);
		cG1_4.addChild(cG3_17);
		cG11_2.addChild(cG1_4);
		cG25_2.addChild(cG26_2);
		cG1.addChild(cG3);
		MAIN.addChild(cG11);
		cG25_1.addChild(cG26_1);
		cG23_7.addChild(cG88_7);
		cG23_10.addChild(cG88_10);
		MAIN.addChild(cG85_2);
		cG1_4.addChild(cG3_22);
		cG88_3.addChild(cG89_3);
		MAIN.addChild(cG82_2);
		cG1_2.addChild(cG3_12);
		MAIN.addChild(cG85);
		cG11_1.addChild(cG1_2);
		cG23_1.addChild(cG25_1);
		cG1.addChild(cG1_1);
		cG23_6.addChild(cG25_6);
		cG25.addChild(cG26);
		cG25_10.addChild(cG26_10);
		MAIN.addChild(cG23_5);
		cG1_4.addChild(cG3_19);
		cG1.addChild(cG3_3);
		cG23_8.addChild(cG25_8);
		cG25_9.addChild(cG26_9);
		cG23_3.addChild(cG88_3);
		cG25_6.addChild(cG26_6);
		cG1.addChild(cG3_6);
		cG1_4.addChild(cG3_18);
		cG23_2.addChild(cG25_2);
		MAIN.addChild(cG23_7);
		cG23_2.addChild(cG88_2);
		cG88_7.addChild(cG89_7);
		cG23_11.addChild(cG88_11);
		cG88_1.addChild(cG89_1);
		cG23.addChild(cG25);
		cG88_11.addChild(cG89_11);
		MAIN.addChild(cG85_1);
		MAIN.addChild(cG82_1);
		cG1.addChild(cG3_2);
		MAIN.addChild(cG23_6);
		MAIN.addChild(cG82_5);
		cG88_2.addChild(cG89_2);
		cG23_7.addChild(cG25_7);
		cG25_5.addChild(cG26_5);
		cG88_10.addChild(cG89_10);
		cG25_7.addChild(cG26_7);
		cG88_8.addChild(cG89_8);
		MAIN.addChild(cG23_1);
		cG1_2.addChild(cG3_15);
		cG88_9.addChild(cG89_9);
		cG23_9.addChild(cG88_9);
		cG23_10.addChild(cG25_10);
		cG23_3.addChild(cG25_3);
		cG25_3.addChild(cG26_3);
		cG23_1.addChild(cG88_1);
		cG1.addChild(cG3_4);
		MAIN.addChild(cG23_10);
		cG1.addChild(cG3_5);
		cG1_2.addChild(cG3_9);
		MAIN.addChild(cG23_8);
		cG25_8.addChild(cG26_8);
		cG1_4.addChild(cG1_5);
		cG1_4.addChild(cG3_21);
		MAIN.addChild(cG23_11);
		cG88_6.addChild(cG89_6);
		cG1_2.addChild(cG3_8);
		cG1_2.addChild(cG3_13);
		MAIN.addChild(cG23_4);
		MAIN.addChild(cG82_3);
		cG1_4.addChild(cG3_20);
		cG1_4.addChild(cG3_16);
		cG25_4.addChild(cG26_4);
		cG23_4.addChild(cG25_4);
		cG1_2.addChild(cG3_11);
		cG23_4.addChild(cG88_4);
		MAIN.addChild(cG23);
		MAIN.addChild(cG23_2);
		cG1_2.addChild(cG3_14);
		cG23_6.addChild(cG88_6);
		cG88_4.addChild(cG89_4);
		cG1.addChild(cG3_7);
		cG23.addChild(cG88);
		cG1_2.addChild(cG3_10);
		cG88.addChild(cG89);
		cG23_11.addChild(cG25_11);
		cG1.addChild(cG3_1);
		MAIN.addChild(cG11_1);
		MAIN.addChild(cG11_2);
		cG23_5.addChild(cG88_5);
		MAIN.addChild(cG82);
		cG23_9.addChild(cG25_9);
		MAIN.addChild(cG23_3);
		cG23_5.addChild(cG25_5);
		cG11.addChild(cG1);
		cG1_4.addChild(cG3_23);
		cG1_2.addChild(cG1_3);
	}

	@Override
	public void setRotationAngles(Entity entity, float v, float v1, float v2, float v3, float v4) {

	}
	
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.push();
		Minecraft.getInstance().getTextureManager().bindTexture(TEXTURE);
	//	matrixStack.translate(MAIN.offsetX, MAIN.offsetY, MAIN.offsetZ);
		matrixStack.translate(MAIN.rotationPointX, MAIN.rotationPointY, MAIN.rotationPointZ);
		matrixStack.scale(0.5F, 0.5F, 0.5F);
		//matrixStack.translate(-MAIN.offsetX, -MAIN.offsetY, -MAIN.offsetZ);
		matrixStack.translate(-MAIN.rotationPointX, -MAIN.rotationPointY, -MAIN.rotationPointZ);
		MAIN.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pop();
	}

}
